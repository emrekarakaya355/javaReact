package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobTitleServices;
import com.example.hrms.dataAccess.abstracts.JobTitleDao;
import com.example.hrms.entities.concretes.JobTitles;

@Service
public class JobTitleManager implements JobTitleServices {
	@Autowired
	private JobTitleDao jobTitleDao;
	
	@Override
	public List<JobTitles> getAll() {
		// TODO Auto-generated method stub
		return this.jobTitleDao.findAll();
	}

}
