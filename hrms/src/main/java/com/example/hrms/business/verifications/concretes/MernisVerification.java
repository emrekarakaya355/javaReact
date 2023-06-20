package com.example.hrms.business.verifications.concretes;

import org.springframework.stereotype.Component;

import com.example.hrms.business.verifications.abstracts.UserVerification;
import com.example.hrms.entities.concretes.Employee;

@Component("mernisVerification")
public class MernisVerification implements UserVerification<Employee> {


	@Override
	public boolean verify(Employee t) {
		// TODO Auto-generated method stub
		return true;
	}

}
