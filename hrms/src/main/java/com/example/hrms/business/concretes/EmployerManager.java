package com.example.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.business.rules.concretes.EmployerRule;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements UserService<Employer> {
	
	private EmployerDao employerDao;
	private EmployerRule employerRule;
	

	@Autowired
	public EmployerManager(EmployerDao employerDao, EmployerRule employerRule) {
		super();
		this.employerDao = employerDao;
		this.employerRule = employerRule;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public Result add(Employer employer) {
		Result result = this.employerRule.checkUser(employer);
		if(result.isSuccess()) {
			employerDao.save(employer);
		}
		
		return result;
	}

}
