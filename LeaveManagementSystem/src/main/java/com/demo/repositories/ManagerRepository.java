package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer>{
	Manager findById(long id);
	Manager findByRoleAndDepartment(String role,String department);
	Manager findByUsernameAndPassword(String username,String password);
	@Query(value="select max(id) from manager" ,nativeQuery = true)
	long findByMaxId();
	
	List<Manager> findByStatus(String status);
	
}
