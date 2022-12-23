package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Admin;
import com.demo.model.Employee;
import com.demo.model.Manager;
import com.demo.repositories.AdminRepository;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.ManagerRepository;
import com.demo.service.ManagerService;

@Controller
public class ManagerController {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	ManagerService hs;
	@Autowired
	AdminRepository arep;
	@Autowired
	ManagerRepository mrep;
	@RequestMapping("/")
	public String home() {
		return "login";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("username") String username,@RequestParam("password")String password) {
		ModelAndView mv=new ModelAndView();
		Employee  emp= erep.findByUsernameAndPassword(username, password);
		Admin admin= arep.findByusernameAndPassword(username, password);
		Manager manager=mrep.findByUsernameAndPassword(username, password);
		
		if(emp!=null) {
			mv.setViewName("EmployeeDashboard");
			mv.addObject("Employee", emp);
			return mv;
		}else if(manager!=null) {
			mv.setViewName("ManagerDashboard");
			List<Employee> employee=erep.findByDepartment(manager.getDepartment());
			mv.addObject("Employee", employee);
			return mv;
		}else if(admin!=null) {
			mv.setViewName("AdminDashboard");
			List<Manager> managers=mrep.findAll();
			mv.addObject("Managers", managers);
			return mv;
		}else {
			String fail="fail";
			mv.addObject("fail", fail);
			mv.setViewName("login");
			return mv;
		}
	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView add(Model model ,Employee employee) {
		Employee emp =hs.add(employee);
		erep.save(emp);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("ManagerDashboard");
		List<Employee> employees =erep.findByStatusAndDepartment("Active",emp.getDepartment());
		mv.addObject("employee", employees);
		return mv;
		
	}
	
	@RequestMapping("/deleteEmployee")
	public ModelAndView delete(@RequestParam("id") long id) {
		Employee employee =erep.findById(id);
		employee.setStatus("Inactive");
		erep.save(employee);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ManagerDashboard");
		List<Employee> employees =erep.findByStatusAndDepartment("Active",employee.getDepartment());
		mv.addObject("employee", employees);
		return mv;
	}
}
