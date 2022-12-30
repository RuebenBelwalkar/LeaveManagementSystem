package com.demo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.model.Employee;

import com.demo.repositories.EmployeeRepository;

@Component
public class AdminService {
	@Autowired
	EmployeeRepository erep;
	public Employee add(Employee employee) {
		
		employee.setAdoptionLeave(30);
		employee.setCasualLeave(15);
		employee.setMarriageLeave(15);
		employee.setMaternityLeave(180);
		employee.setPaternityLeave(30);
		employee.setPersonalLeave(15);
		employee.setSickLeave(15);
		employee.setStatus("Active");
		erep.save(employee);
		
		Employee emp=erep.findById(erep.findByMaxId());
		String name=emp.getName();
		
		int id=emp.getId();
		emp.setUsername(name+id);
		Random random =new Random();
		int num =random.nextInt(1000);
		emp.setPassword(name+num);
		
		return emp;
		
	}
}
