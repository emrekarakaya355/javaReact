package com.example.hrms.business.rules.abstracts;

import org.springframework.stereotype.Service;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.abstracts.BaseUser;

@Service
public interface UserRule<T extends BaseUser> {
	
	Result checkUser(T user);
}
