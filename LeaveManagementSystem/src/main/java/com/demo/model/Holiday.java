package com.demo.model;



import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Holiday {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hid;
	private Date dates;
	private String occasion;
	
	

	public Holiday(String occasion, Date date) {
		super();
		
		this.dates = date;
		this.occasion = occasion;
	}
	public Date getDate() {
		return dates;
	}
	public void setDate(Date date) {
		this.dates = date;
	}
	

	public String getOccasion() {
		return occasion;
	}
	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}
	@Override
	public String toString() {
		return "Holidays [ date=" + dates + ", occasion=" + occasion + "]";
	}
	
}
