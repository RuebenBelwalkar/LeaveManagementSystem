package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Admin;
import com.demo.model.Employee;
import com.demo.repositories.AdminRepository;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.HolidayRepository;
import com.demo.service.AdminService;
import com.demo.service.ManagerService;

@Controller
public class AdminController {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	ManagerService hs;
	@Autowired
	AdminService as;
	@Autowired
	HolidayRepository hrep;
	@Autowired
	AdminRepository arep;
	
	@RequestMapping("/addEmployee")
	public ModelAndView add(Model model ,Employee employee,@RequestParam("aid")int id) {
		Admin admin=arep.findById(id);
		Employee emp =as.add(employee);
		emp.setAdmin(admin);
		System.out.println(employee);
		erep.save(emp);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("AdminAddEmployee");
		List<Employee> employees =erep.findByStatusAndDepartment("Active",emp.getDepartment());
		mv.addObject("employee", employees);
		mv.addObject("admin", admin);
		String success="Employee successfully addedd!!!";
		mv.addObject("success",success);
		return mv;
	}
	

	@RequestMapping("/AdminDeleteEmployee")
	public ModelAndView delete(@RequestParam("id") int id) {
		Employee employee =erep.findById(id);
		employee.setStatus("Inactive");
		erep.save(employee);
		Admin admin =employee.getAdmin();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("AdminViewEmployee");
		List<Employee> employees =erep.findByStatusAndDepartment("Active",employee.getDepartment());
		mv.addObject("employees", employees);
		mv.addObject("admin", admin);
		return mv;
	}
	
	@RequestMapping("/updateEmployee")
	public ModelAndView update(Model model,Employee employee) {
	Employee emp=erep.findById(employee.getId());
		
		employee.setAdmin(emp.getAdmin());
		System.out.println(employee);
		erep.save(employee);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("AdminUpdateEmployee");
		mv.addObject("employee", employee);
		String success ="Employee Data Updated.";
		mv.addObject("success", success);
		return mv;
	}
	
	
	}
