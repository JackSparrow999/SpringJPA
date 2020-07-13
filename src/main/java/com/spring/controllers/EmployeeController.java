package com.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.Employee;
import com.spring.services.EmployeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
		
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee newEmployee) {
		employeeService.saveEmployee(newEmployee);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee updatedEmployee) {
		employeeService.updateEmployee(updatedEmployee);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable(name = "id") Long id) {
		employeeService.deleteEmployee(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable(name = "id") Long id) {
		return employeeService.getEmployeeById(id);
	}
	
}
