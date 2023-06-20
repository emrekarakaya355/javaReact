package com.example.hrms.business.verifications.abstracts;

import org.springframework.stereotype.Service;
import com.example.hrms.entities.abstracts.BaseUser;

@Service
public interface UserVerification<T extends BaseUser> {
	
	public boolean verify(T t);

	
}
