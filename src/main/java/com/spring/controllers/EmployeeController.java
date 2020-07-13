package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.Employee;
import com.spring.services.EmployeeService;

@RestController
//@RequestMapping(value = "/employees")
public class EmployeeController {
		
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		System.out.println("Endpoint Hit!");
		return employeeService.getAllEmployees();
	}
	
	
	
}
