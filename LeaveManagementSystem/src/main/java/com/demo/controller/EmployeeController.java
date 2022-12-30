package com.demo.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Admin;
import com.demo.model.Employee;
import com.demo.model.Holiday;

import com.demo.repositories.AdminRepository;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.HolidayRepository;
import com.demo.service.ManagerService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	ManagerService hs;
	@Autowired
	AdminRepository arep;
	
	@Autowired
	HolidayRepository hrep;
	@RequestMapping("/")
	public String home() {
		return "login";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("username") String username,@RequestParam("password")String password) {
		System.out.println("Welcome to login controller");
		ModelAndView mv=new ModelAndView();
		Employee employee =erep.findByUsernameAndPassword(username, password);
		Admin admin = arep.findByUsernameAndPassword(username, password);
		String manager="Manager";
	//	String designation=employee.getDesignation();
		if(admin!=null) {
			mv.setViewName("AdminDashboard");
			mv.addObject("admin", admin);
			return mv;
		}else if(employee!=null && employee.getDesignation().equals(manager)) {	
			mv.setViewName("ManagerDashboard");
			mv.addObject("employee", employee);
			return mv;
		}else if(employee!=null && employee.getDesignation()!="Manager") {	
			mv.setViewName("EmployeeDashboard");
			mv.addObject("employee", employee);
			return mv;
		}
		else {
			String error="Invalid Username or Password.";
			mv.setViewName("login");
			mv.addObject("error", error);
			return mv;
		}

		}
	
	

	
}
