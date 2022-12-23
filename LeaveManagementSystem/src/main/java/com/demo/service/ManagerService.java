package com.demo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.ManagerRepository;
@Component
public class ManagerService {
	@Autowired
	EmployeeRepository erep;
	
	@Autowired
	ManagerRepository mrep;
	
//	@Autowired
//	HomeService hs;
	
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
		emp.setManager(mrep.findByRoleAndDepartment("Manager", emp.getDepartment()));
		return emp;
		
	}
	

	
	
	
}
