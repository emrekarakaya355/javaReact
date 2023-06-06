package com.example.hrms.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployeeServices;
import com.example.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return employeeServices.getAll();
	}
	@GetMapping("/get")
	public Optional<Employee> get(){
		return employeeServices.get();
	}
	
}
