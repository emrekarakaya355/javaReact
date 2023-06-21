package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobPositionService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.JobPositionDao;
import com.example.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	@Autowired
	private JobPositionDao jobPositionDao;

	@Override
	public DataResult<List<JobPosition>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll());
	}

	@Override
	public Result add(JobPosition jobPosition) {

		if(this.jobPositionDao.existsByPositionNameIs(jobPosition.getPositionName())) {
			return new ErrorResult("Posizyon ismi zaten var");
			
		}
		this.jobPositionDao.save(jobPosition);
		return new SuccessDataResult<JobPosition>(jobPosition,"Basarı ile eklendi");
	}


	
}
