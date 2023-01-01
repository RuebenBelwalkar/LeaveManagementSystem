package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;
@Controller
public class EmployeeRedirectController {
		@Autowired
		EmployeeRepository erep;
	
	@RequestMapping("/EmployeeDashboard")
	public ModelAndView employeeDashboard(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		mv.setViewName("EmployeeDashboard");
		mv.addObject("employee", employee);
		return mv;
	}
	@RequestMapping("/EmployeeApplyLeave")
	public ModelAndView EmployeeApplyLeave(@RequestParam("id") int id) {
		System.out.println("Employee apply leave");
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		mv.setViewName("EmployeeApplyLeave");
		mv.addObject("employee", employee);
		return mv;
	}
	@RequestMapping("/EmployeeLeaveTracker")
	public ModelAndView EmployeeLeaveTracker(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		mv.setViewName("EmployeeLeaveTracker");
		mv.addObject("employee", employee);
		return mv;
	}
	@RequestMapping("/EmployeeViewProject")
	public ModelAndView EmployeeViewProject(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		mv.setViewName("EmployeeViewProject");
		mv.addObject("employee", employee);
		return mv;
	}
}
