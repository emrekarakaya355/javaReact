package com.example.hrms.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
	@Autowired
	private UserService<Employee> employeeServices;
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return employeeServices.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employee employee){
		return this.employeeServices.add(employee);
		
		
	}
	
}
