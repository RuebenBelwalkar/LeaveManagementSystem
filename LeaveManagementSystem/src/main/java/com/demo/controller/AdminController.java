package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Manager;
import com.demo.repositories.AdminRepository;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.ManagerRepository;
import com.demo.service.AdminService;



@Controller
public class AdminController {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	AdminService as;
	@Autowired
	AdminRepository arep;
	@Autowired
	ManagerRepository mrep;
	
	
	@RequestMapping("/addManager")
	public ModelAndView addManager(Model model,Manager manager,@RequestParam("id")long id) {
		ModelAndView mv=new ModelAndView();
		Manager mg=as.addManager(manager,id);
		mrep.save(mg);
		List<Manager> managers=mrep.findAll();
		mv.addObject("Manager", managers);
		mv.setViewName("adminDashboard");
		return mv;
	}
	
	@RequestMapping("/deleteManager")
	public ModelAndView deleteManager(@RequestParam("id")long id) {
		ModelAndView mv=new ModelAndView();
		Manager manager=mrep.findById(id);
		manager.setStatus("Inactive");
		List<Manager> managers=mrep.findByStatus("Active");
		mv.addObject("Manager", managers);
		mv.setViewName("adminDashboard");
		return mv;
	}
}
