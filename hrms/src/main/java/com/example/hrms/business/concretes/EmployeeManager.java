package com.example.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployeeServices;
import com.example.hrms.dataAccess.abstracts.EmployeeDao;
import com.example.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeServices {
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return this.employeeDao.findAll();
	}

	@Override
	public Optional<Employee> get() {
		// TODO Auto-generated method stub
		return this.employeeDao.findById(1000);
	}
	
	

}
