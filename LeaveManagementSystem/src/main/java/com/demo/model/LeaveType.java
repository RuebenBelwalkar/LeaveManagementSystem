package com.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class LeaveType {

	private int sickLeave;
	private int casualLeave;
	private int personalLeave;
	private int maternityLeave;
	private int paternityLeave;
	private int marriageLeave;
	private int adoptionLeave;
	public int getSickLeave() {
		return sickLeave;
	}
	public void setSickLeave(int sickLeave) {
		this.sickLeave = sickLeave;
	}
	public int getCasualLeave() {
		return casualLeave;
	}
	public void setCasualLeave(int casualLeave) {
		this.casualLeave = casualLeave;
	}
	public int getPersonalLeave() {
		return personalLeave;
	}
	public void setPersonalLeave(int personalLeave) {
		this.personalLeave = personalLeave;
	}
	public int getMaternityLeave() {
		return maternityLeave;
	}
	public void setMaternityLeave(int maternityLeave) {
		this.maternityLeave = maternityLeave;
	}
	public int getPaternityLeave() {
		return paternityLeave;
	}
	public void setPaternityLeave(int paternityLeave) {
		this.paternityLeave = paternityLeave;
	}
	public int getMarriageLeave() {
		return marriageLeave;
	}
	public void setMarriageLeave(int marriageLeave) {
		this.marriageLeave = marriageLeave;
	}
	public int getAdoptionLeave() {
		return adoptionLeave;
	}
	public void setAdoptionLeave(int adoptionLeave) {
		this.adoptionLeave = adoptionLeave;
	}
	@Override
	public String toString() {
		return "LeaveType [sickLeave=" + sickLeave + ", casualLeave=" + casualLeave + ", personalLeave=" + personalLeave
				+ ", maternityLeave=" + maternityLeave + ", paternityLeave=" + paternityLeave + ", marriageLeave="
				+ marriageLeave + ", adoptionLeave=" + adoptionLeave + "]";
	}
	
}
