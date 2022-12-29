package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Admin;
import com.demo.repositories.AdminRepository;
import com.demo.repositories.EmployeeRepository;

@Controller
public class AdminRedirectController {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	AdminRepository arep;
	
	@RequestMapping("/AdminAddEmployee")
	public ModelAndView rAdd(@RequestParam("id") int id) {
		System.out.println("Redirect Controller");
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Admin admin = arep.findById(id);
		mv.setViewName("AdminAddEmployee");
		mv.addObject("admin", admin);
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
		mv.setViewName("AdminAddProject");
		mv.addObject("admin", admin);
		return mv;
	}
	@RequestMapping("/AdminManageLeave")
	public ModelAndView adminLeave(@RequestParam("id") int id) {
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Admin admin = arep.findById(id);
		mv.setViewName("AdminManageLeave");
		mv.addObject("admin", admin);
		return mv;
	}
	@RequestMapping("/AdminViewEmployee")
	public ModelAndView adminEmployee(@RequestParam("id") int id) {
		ModelAndView mv =new ModelAndView();
		System.out.println(id);
		Admin admin = arep.findById(id);
		mv.setViewName("AdminViewEmployee");
		mv.addObject("admin", admin);
		return mv;
	}
	
}
