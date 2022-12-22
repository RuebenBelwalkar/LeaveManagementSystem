package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;
import com.demo.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	HomeService hs;
//	@RequestMapping("/")
//	public String home() {
//		return "login";
//	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("username") String username,@RequestParam("password")String password) {
		ModelAndView mv=new ModelAndView();
		Employee  emp= erep.findByUsernameAndPassword(username, password);
		if(emp.getRole()=="Employee") {
			mv.setViewName("EmployeeDashboard");
			mv.addObject("Employee", emp);
			return mv;
		}else if(emp.getRole()=="Manager") {
			mv.setViewName("ManagerDashboard");
			mv.addObject("Employee", emp);
			return mv;
		}else if(emp.getRole()=="Admin") {
			mv.setViewName("AdminDashboard");
			mv.addObject("Employee", emp);
			return mv;
		}else {
			String fail="fail";
			mv.addObject("fail", fail);
			mv.setViewName("login");
			return mv;
		}
	}
	
	@RequestMapping("/add")
	public ModelAndView add(Model model ,Employee employee) {
		Employee emp =hs.add(employee);
		erep.save(emp);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("ManagerDashboard");
		List<Employee> employees =erep.findByStatus("Active");
		mv.addObject("employee", employees);
		return mv;
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") long id) {
		Employee employee =erep.findById(id);
		employee.setStatus("Inactive");
		erep.save(employee);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ManagerDashboard");
		List<Employee> employees =erep.findByStatus("Active");
		mv.addObject("employee", employees);
		return mv;
	}
}
