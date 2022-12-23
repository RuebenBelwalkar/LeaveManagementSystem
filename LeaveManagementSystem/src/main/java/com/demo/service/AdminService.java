package com.demo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.model.Admin;
import com.demo.model.Employee;
import com.demo.model.Manager;
import com.demo.repositories.AdminRepository;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.ManagerRepository;

@Component
public class AdminService {
	@Autowired
	EmployeeRepository erep;
	@Autowired
	AdminRepository arep;
	@Autowired
	ManagerRepository mrep;
	@Autowired
	AdminRepository as;
	public Manager addManager(Manager manager,long aid) {
		Admin admin=as.findById(aid);
		mrep.save(manager);
		Manager mg=mrep.findById(mrep.findByMaxId());
		String name=mg.getName();
		long id=mg.getId();
		mg.setUsername(name+id);
		Random random =new Random();
		int num =random.nextInt(1000);
		mg.setPassword(name+num);
		mg.setLeaves(30);
		mg.setStatus("Active");
		mg.setPendingLeave(30);
		mg.setAdmin(admin);
		return manager;
	}
}
