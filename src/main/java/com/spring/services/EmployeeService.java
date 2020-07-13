package com.spring.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.models.Employee;
import com.spring.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		ArrayList<Employee> arr = new ArrayList<>();
		Iterator<Employee> itr = employeeRepository.findAll().iterator();
		while(itr.hasNext()) 
			arr.add(itr.next());
		return arr;
	}
	
	public void saveEmployee(Employee newEmployee) {
		employeeRepository.save(newEmployee);
	}
	
	public void updateEmployee(Employee updateEmployee) {
		employeeRepository.save(updateEmployee);
	}
	
	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
	}
	
	public Employee getEmployeeById(Long employeeId) {
		Optional<Employee> res = employeeRepository.findById(employeeId);
		if(res.isPresent())
			return res.get();
		else
			return null;
	}
	
}
