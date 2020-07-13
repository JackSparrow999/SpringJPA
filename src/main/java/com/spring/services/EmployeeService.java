package com.spring.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
}
