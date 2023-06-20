package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.abstracts.BaseUser;

public interface UserService<T extends BaseUser> {
	DataResult<List<T>> getAll();
	Result add(T t);

}
