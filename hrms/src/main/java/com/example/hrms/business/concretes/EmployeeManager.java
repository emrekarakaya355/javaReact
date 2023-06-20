package com.example.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.business.rules.abstracts.UserRule;
import com.example.hrms.business.rules.concretes.EmployeeRule;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.EmployeeDao;
import com.example.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements UserService<Employee> {
	private EmployeeDao employeeDao;
	private UserRule<Employee> employeeRule;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao,EmployeeRule employeeRule) {
		super();
		this.employeeDao = employeeDao;
		this.employeeRule=employeeRule;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}

	@Override
	public Result add(Employee employee) {
		Result result = this.employeeRule.checkUser(employee);
		if(result.isSuccess()) {
			this.employeeDao.save(employee);
		}
		return result;	
	}
	
	 

	

}
