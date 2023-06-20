package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrms.business.abstracts.JobTitleServices;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobTitleDao;
import com.example.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleServices {
	@Autowired
	private JobTitleDao jobTitleDao;

	@Override
	public DataResult<List<JobTitle>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll());
	}

	@Override
	public Result add(JobTitle jobTitle) {

		if(this.jobTitleDao.existsByPositionNameIs(jobTitle.getPositionName())) {
			return new ErrorResult("Posizyon ismi zaten var");
			
		}
		this.jobTitleDao.save(jobTitle);
		return new SuccessDataResult<JobTitle>(jobTitle,"Basarı ile eklendi");
	}


	
}
