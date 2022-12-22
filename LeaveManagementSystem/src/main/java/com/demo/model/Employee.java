package com.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String age;
	private String Address;
	private String state;
	private String country;
	private String designation;
	private String department;
	private String role;
	private long mobileNumber;
	private String email;
	private String status;
	private int leaves;
	private int pendingLeave;
	private String username;
	private String password;
	@OneToMany(mappedBy = "employee")
	private List<Leave> totalLeave;
	
	
	
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
	public int getPendingLeave() {
		return pendingLeave;
	}
	public void setPendingLeave(int pendingLeave) {
		this.pendingLeave = pendingLeave;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Leave> getTotalLeave() {
		return totalLeave;
	}
	public void setTotalLeave(List<Leave> totalLeave) {
		this.totalLeave = totalLeave;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", Address=" + Address + ", state=" + state
				+ ", country=" + country + ", designation=" + designation + ", department=" + department + ", role="
				+ role + ", mobileNumber=" + mobileNumber + ", email=" + email + ", status=" + status + ", leaves="
				+ leaves + ", pendingLeave=" + pendingLeave + ", username=" + username + ", password=" + password
				+ ", totalLeave=" + totalLeave + "]";
	}
	
	
	
	
	
	
}
