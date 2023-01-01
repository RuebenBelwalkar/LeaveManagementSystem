package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Admin;
import com.demo.model.Employee;
import com.demo.model.Leaves;
import com.demo.repositories.AdminRepository;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.LeavesRepository;

@Controller
public class AdminRedirectController {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	AdminRepository arep;
	@Autowired
	LeavesRepository lrep;
	
	@RequestMapping("/AdminAddEmployee")
	public ModelAndView rAdd(@RequestParam("id") int id) {
		System.out.println("Redirect Controller");
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Admin admin = arep.findById(id);
		mv.setViewName("AdminAddEmployee");
		mv.addObject("admin", admin);
		List<Employee> employee=erep.findByDesignation("Manager");
		mv.addObject("employees", employee);
		return mv;
	}
	
	@RequestMapping("/AdminDashboard")
	public ModelAndView adminDash(@RequestParam("id") int id) {
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Admin admin = arep.findById(id);
		mv.setViewName("AdminDashboard");
		mv.addObject("admin", admin);
		return mv;
	}
	@RequestMapping("/AdminAddHoliday")
	public ModelAndView adminHoliday(@RequestParam("id") int id) {
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Admin admin = arep.findById(id);
		mv.setViewName("AdminAddHoliday");
		mv.addObject("admin", admin);
		return mv;
	}
	@RequestMapping("/AdminAddProject")
	public ModelAndView adminProject(@RequestParam("id") int id) {
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Admin admin = arep.findById(id);
		List<Employee> IT =erep.findByDepartmentAndDesignation("IT", "Manager");
		List<Employee> HR =erep.findByDepartmentAndDesignation("IT", "Manager");
		List<Employee> Finance =erep.findByDepartmentAndDesignation("IT", "Manager");
		System.out.println(IT);
		mv.setViewName("AdminAddProject");
		mv.addObject("admin", admin);
		mv.addObject("IT", IT);
		mv.addObject("HR", HR);
		mv.addObject("Finance", Finance);
		return mv;
	}
	@RequestMapping("/AdminManageLeave")
	public ModelAndView adminLeave(@RequestParam("id") int id) {
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Admin admin = arep.findById(id);
		List<Leaves> leaves = lrep.findByEmpDesignationAndStatus("Manager","Pending");
		mv.addObject("leaves", leaves);
		mv.setViewName("AdminManageLeave");
		mv.addObject("admin", admin);
		return mv;
	}
	@RequestMapping("/AdminViewEmployee")
	public ModelAndView adminEmployee(@RequestParam("id") int id) {
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Admin admin = arep.findById(id);
		List<Employee> employee=erep.findByDesignation("Manager");
		mv.addObject("employees", employee);
		mv.setViewName("AdminViewEmployee");
		mv.addObject("admin", admin);	
		return mv;
	}
	
	@RequestMapping("/AdminUpdateEmployee")
	public ModelAndView adminUpdatwEmployee(@RequestParam("id") int id) {
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Employee employee = erep.findById(id);
		mv.setViewName("AdminUpdateEmployee");
		mv.addObject("employee", employee);	
		return mv;
	}
	
}
