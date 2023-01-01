package com.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Leaves;

public interface LeavesRepository extends JpaRepository<Leaves, Integer> {
	List<Leaves> findByEmpId(int id);
	Leaves findById(int id);
	List<Leaves> findByEmpDesignationAndStatus(String empDesignation,String status);
	List<Leaves> findByManagerNameAndStatus(String managerName,String status);
	
}
