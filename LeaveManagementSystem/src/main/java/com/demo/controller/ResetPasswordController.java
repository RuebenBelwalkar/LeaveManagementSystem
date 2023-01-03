package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Admin;
import com.demo.repositories.AdminRepository;
import com.demo.service.ResetPasswordService;

@Controller
public class ResetPasswordController {
		
	@Autowired
	AdminRepository arep;
	@Autowired
	ResetPasswordService rps;
	@RequestMapping("/AdminResetPassword")
	public ModelAndView adminpwd(@RequestParam("id") int id) {
		System.out.println(id);
		Admin admin=arep.findById(id);
		System.out.println(admin);
		ModelAndView mv=new ModelAndView();
		mv.addObject("admin", admin);
		mv.setViewName("AdminResetPassword");
		return mv;
		
	}
	
	@RequestMapping("/adminreset")
	public ModelAndView adminreset(@RequestParam("oldPassword") String oldPass,
							@RequestParam("newPassword") String newPass,
							@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView();
		System.out.println(oldPass);
		System.out.println(newPass);
		System.out.println(id);
		Admin admin=arep.findById(id);
		boolean checkPassword=rps.adminPasswordCheck(admin, oldPass);
		if(checkPassword==true) {
			admin.setPassword(newPass);
			arep.save(admin);
			mv.setViewName("login");
			return mv;
		}else {
			String wrongPassword="Please enter correct old password";
			mv.addObject("wrongPassword", wrongPassword);
			mv.addObject("admin", admin);
			mv.setViewName("AdminResetPassword");
			return mv;
		}
	}
}
