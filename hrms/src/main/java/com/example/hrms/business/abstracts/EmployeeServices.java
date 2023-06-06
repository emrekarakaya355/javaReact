package com.example.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import com.example.hrms.entities.concretes.Employee;

public interface EmployeeServices {
		List<Employee> getAll();
		Optional<Employee> get();
}
