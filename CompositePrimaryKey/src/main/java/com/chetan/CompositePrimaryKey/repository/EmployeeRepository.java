package com.chetan.CompositePrimaryKey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chetan.CompositePrimaryKey.model.EmployeePKId;
import com.chetan.CompositePrimaryKey.model.Emplyoee;

@Repository
public interface  EmployeeRepository  extends JpaRepository<Emplyoee, EmployeePKId>{

}
