package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Admin findById(long id);
	Admin findByusernameAndPassword(String username,String password);
	
}
