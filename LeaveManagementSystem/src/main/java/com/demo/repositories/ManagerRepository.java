package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer>{
	Manager findById(long id);
	Manager findByRoleAndDepartment(String role,String department);
}
