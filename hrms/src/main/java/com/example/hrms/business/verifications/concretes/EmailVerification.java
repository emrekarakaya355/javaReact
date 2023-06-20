package com.example.hrms.business.verifications.concretes;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.hrms.business.verifications.abstracts.UserVerification;
import com.example.hrms.entities.abstracts.BaseUser;

@Service
@Component("emailVerification")
public class EmailVerification<T extends BaseUser> implements UserVerification<BaseUser>{


	@Override
	public boolean verify(BaseUser t) {
		// TODO Auto-generated method stub
		return true;
	}

}
