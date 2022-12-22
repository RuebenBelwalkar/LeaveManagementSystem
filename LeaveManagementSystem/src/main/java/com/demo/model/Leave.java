package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Leave {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	private String leaveType;
	private int days;
	@ManyToOne
	Employee employee;
	private String reason;
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Leave [lid=" + lid + ", leaveType=" + leaveType + ", days=" + days + ", employee=" + employee + "]";
	}
	
	
}
