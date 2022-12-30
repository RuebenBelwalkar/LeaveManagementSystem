package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;
import com.demo.model.Leaves;
import com.demo.repositories.AdminRepository;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.LeavesRepository;

@Controller
public class ManagerRedirectController {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	AdminRepository arep;
	@Autowired
	LeavesRepository lrep;
	
	@RequestMapping("/ManagerDashboard")
	public ModelAndView managerDashboard(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		mv.setViewName("ManagerDashboard");
		mv.addObject("employee", employee);
		return mv;
	}
	@RequestMapping("/ManagerApplyLeave")
	public ModelAndView managerApplyLeave(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		mv.setViewName("ManagerApplyLeave");
		mv.addObject("employee", employee);
		return mv;
	}
	@RequestMapping("/ManagerManageLeave")
	public ModelAndView managerLeaveManage(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		mv.setViewName("ManagerManageLeave");
		mv.addObject("employee", employee);
		return mv;
	}
	@RequestMapping("/ManagerViewEmployee")
	public ModelAndView managerViewEmployee(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		mv.setViewName("ManagerViewEmployee");
		mv.addObject("employee", employee);
		return mv;
	}
	@RequestMapping("/ManagerViewProject")
	public ModelAndView managerViewProject(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		mv.setViewName("ManagerViewProject");
		mv.addObject("employee", employee);
		return mv;
	}
	@RequestMapping("/ManagerLeaveTracker")
	public ModelAndView managerLeaveTracker(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		Employee employee=erep.findById(id);
		List<Leaves> leaves =lrep.findByEmpId(id);
		System.out.println(leaves);
		mv.setViewName("ManagerLeaveTracker");
		mv.addObject("employee", employee);
		mv.addObject("leaves", leaves);
		return mv;
	}
}
