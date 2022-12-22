package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findById(long id);
	Employee findByRole(String role);
	Employee findByDepartmentAndDesignation(String department,String Designation);
	List<Employee> findByStatus(String status);
	Employee findByUsernameAndPassword(String username,String password);
	@Query(value="select max(id) from employee" ,nativeQuery = true)
	long findByMaxId();
	
	
}
