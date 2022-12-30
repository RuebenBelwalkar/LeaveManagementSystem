package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findById(int id);
	
	Employee findByDepartmentAndDesignation(String department,String Designation);
	List<Employee> findByStatusAndDepartment(String status,String department);
	Employee findByUsernameAndPassword(String username,String password);
	@Query(value="select max(id) from employee" ,nativeQuery = true)
	int findByMaxId();
	List<Employee> findByDepartment(String department);
	List<Employee> findByDesignation(String designation);
	
}
