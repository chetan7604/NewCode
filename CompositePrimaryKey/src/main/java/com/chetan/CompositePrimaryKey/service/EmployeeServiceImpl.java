package com.chetan.CompositePrimaryKey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetan.CompositePrimaryKey.model.Emplyoee;
import com.chetan.CompositePrimaryKey.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmp(Emplyoee emp) {
		Emplyoee emplyoee = employeeRepository.save(emp);

		
	}
}
