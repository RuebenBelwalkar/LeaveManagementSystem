package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.repositories.AdminRepository;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.HolidayRepository;
import com.demo.service.ManagerService;

@Controller
public class AdminController {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	ManagerService hs;
	
	@Autowired
	HolidayRepository hrep;
	
//	@RequestMapping("/addEmployee")
//	public void add1() {
//		
//	}
	}
