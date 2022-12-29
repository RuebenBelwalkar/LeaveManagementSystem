package com.demo.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, Integer>{

}
