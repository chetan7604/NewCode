package com.chetan.CompositePrimaryKey.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;


@Entity
@IdClass(EmployeePKId.class)
public class Emplyoee {
	
	
	@Id
	private int empid;

	private String empName;
	
	private String empSalary;
	
	private String empAddress;
	@Id
	private int emprating;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmprating() {
		return emprating;
	}
	public void setEmprating(int emprating) {
		this.emprating = emprating;
	}
	@Override
	public String toString() {
		return "Emplyoee [empid=" + empid + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + ", emprating=" + emprating + "]";
	}
	
	
	

}
