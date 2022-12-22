package com.demo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;

public class HomeService {
	@Autowired
	EmployeeRepository erep;
	
	@Autowired
	HomeService hs;
	
	public Employee add(Employee employee) {
		erep.save(employee);
		Employee emp=erep.findById(erep.findByMaxId());
		String name=emp.getName();
		long id=emp.getId();
		emp.setUsername(name+id);
		Random random =new Random();
		int num =random.nextInt(1000);
		emp.setPassword(name+num);
		emp.setLeaves(30);
		emp.setStatus("Active");
		emp.setPendingLeave(30);
		
		
	}
	

	
	
	
}
