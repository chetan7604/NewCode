package com.chetan.CompositePrimaryKey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.chetan.CompositePrimaryKey.controller.EmployeeController;
import com.chetan.CompositePrimaryKey.model.Emplyoee;

@SpringBootApplication
public class CompositePrimaryKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CompositePrimaryKeyApplication.class, args);
		
		EmployeeController employeeController = context.getBean(EmployeeController.class);
		
         Emplyoee emp=new Emplyoee();
                  emp.setEmpid(1);
                  emp.setEmpAddress("pune");
                  emp.setEmpName("chetan");
                  emp.setEmpSalary("70000");
                  emp.setEmprating(100);

        employeeController.saveEmp(emp);
		
	}

}
