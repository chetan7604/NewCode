package com.chetan.CompositePrimaryKey.model;

import java.io.Serializable;

public class EmployeePKId implements Serializable{
	
	private int empid;
	
	private int emprating;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmprating() {
		return emprating;
	}

	public void setEmprating(int emprating) {
		this.emprating = emprating;
	}
	
	

}
