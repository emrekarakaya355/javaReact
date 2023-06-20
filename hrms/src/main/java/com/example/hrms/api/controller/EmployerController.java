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
import com.example.hrms.entities.concretes.Employer;


@RestController
@RequestMapping("api/employer")
public class EmployerController {
	@Autowired
	private UserService<Employer> employerServices;
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return employerServices.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer){
		return this.employerServices.add(employer);
		
		
	}
}
