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
import com.demo.model.Leaves;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.LeavesRepository;
import com.demo.service.LeaveService;

@Controller
public class LeavesController {
	@Autowired
	LeavesRepository lrep;
	@Autowired
	EmployeeRepository erep;
	@Autowired
	LeaveService ls;
	@RequestMapping("/applyLeave")
	public ModelAndView leaveApplication(Model model,Leaves leave) {
		System.out.println("Welcome to leave application");
		ModelAndView mv=new ModelAndView();
		boolean checkDuplicate=ls.checkManagerLeaveDuplicate(leave);
		if(checkDuplicate==true) {
			leave.setStatus("Pending");
			System.out.println(leave);
			lrep.save(leave);
			mv.setViewName("ManagerApplyLeave");
			Employee employee =erep.findById(leave.getEmpId());
			mv.addObject("employee", employee);
			String success="Leave applied Successfully";
			mv.addObject("success", success);
			System.out.println(leave);
			return mv;
		}else {
			mv.setViewName("ManagerApplyLeave");
			Employee employee =erep.findById(leave.getEmpId());
			mv.addObject("employee", employee);
			String duplicate="Already applied for this leave";
			mv.addObject("duplicate", duplicate);
			return mv;
		}
	
		
	}
	
	@RequestMapping("/accept")
	public ModelAndView accept(@RequestParam("lid") int id) {
		System.out.println("Accept controller");
		ModelAndView mv=new ModelAndView();
		Leaves leave=lrep.findById(id);
		leave.setStatus("Approved");
		lrep.save(leave);
		Admin admin= ls.accept(leave);
		mv.setViewName("AdminManageLeave");
		mv.addObject("admin", admin);
		List<Leaves> leaves=lrep.findByEmpDesignationAndStatus("Manager","Pending");
		System.out.println(leaves);
		mv.addObject("leaves", leaves);
		return mv;
	}
	
	@RequestMapping("/reject")
	public ModelAndView reject(@RequestParam("lid") int id) {
		ModelAndView mv=new ModelAndView();
		Leaves leave=lrep.findById(id);
		leave.setStatus("Denied");
		lrep.save(leave);
		Admin admin= ls.reject(leave);
		mv.setViewName("AdminManageLeave");
		mv.addObject("admin", admin);
		List<Leaves> leaves=lrep.findByEmpDesignationAndStatus("Manager","Pending");
		System.out.println(leaves);
		mv.addObject("leaves", leaves);
		return mv;
	}
	
	@RequestMapping("/empApplyLeave")
	public ModelAndView empApplyLeave(Leaves leave) {
	
	
	
		
		ModelAndView mv=new ModelAndView();
		leave.setStatus("Pending");
	
		lrep.save(leave);
		mv.setViewName("EmployeeApplyLeave");
		Employee employee =erep.findById(leave.getEmpId());
		mv.addObject("employee", employee);
		String success="Leave applied Successfully";
		mv.addObject("success", success);
	
		leave.setStatus("Pending");
		lrep.save(leave);
		return mv;
	}
	
	@RequestMapping("/empaccept")
	public ModelAndView empAccept(@RequestParam("lid") int id) {
		System.out.println("emp accept");
		System.out.println(id);
		ModelAndView mv = new ModelAndView();
		Leaves leave= lrep.findById(id);
		leave.setStatus("Approved");
		Employee manager= ls.empAccept(leave);
		mv.addObject("employee", manager);
		List<Leaves> leaves=lrep.findByManagerNameAndStatus(manager.getName(),"Pending");
		mv.addObject("employees", manager);
		mv.setViewName("ManagerManageLeave");
		mv.addObject("leaves", leaves);
		return mv;
		
	}
	
	@RequestMapping("/empreject")
	public ModelAndView empReject(@RequestParam("lid") int id) {
		System.out.println("Emp accept");
		ModelAndView mv = new ModelAndView();
		Leaves leave=lrep.findById(id);
		leave.setStatus("Denied");
		lrep.save(leave);
		Employee manager=ls.empReject(leave);
		List<Leaves> leaves=lrep.findByManagerNameAndStatus(manager.getName(),"Pending");
		mv.addObject("employees", manager);
		mv.setViewName("ManagerManageLeave");
		mv.addObject("leaves", leaves);
		return mv;
		
	}
}
