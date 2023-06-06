package com.example.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobTitleServices;
import com.example.hrms.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/titles")
public class JobTitlesController {
	@Autowired
	private JobTitleServices jobTitleServices;
	
	@GetMapping("/getall")
	public List<JobTitles> getAll(){
		return this.jobTitleServices.getAll();
	}

}
