package com.chetan.CompositePrimaryKey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.chetan.CompositePrimaryKey.model.Emplyoee;
import com.chetan.CompositePrimaryKey.service.EmployeeServiceI;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceI employeeServiceI;
	

	public void saveEmp(Emplyoee emp) {
	
		employeeServiceI.saveEmp(emp);
	}
}


