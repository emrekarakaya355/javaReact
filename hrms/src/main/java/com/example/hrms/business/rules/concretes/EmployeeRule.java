package com.example.hrms.business.rules.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.hrms.business.rules.abstracts.UserRule;
import com.example.hrms.business.verifications.abstracts.UserVerification;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.EmployeeDao;
import com.example.hrms.entities.concretes.Employee;

@Service
public class EmployeeRule implements UserRule<Employee> {

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	@Qualifier("emailVerification") private UserVerification<Employee>
	emailVerification;


	@Autowired
	@Qualifier("mernisVerification") private UserVerification<Employee>
	mernisVerification;

	@Override
	public Result checkUser(Employee employee) {
		if (employee.getFirstName() == null || employee.getEmail() == null || employee.getPassword() == null
				|| employee.getLastName() == null || employee.getNationalIdentity() == null) {
			return new ErrorResult("Bütün alanları doldurmanız gerekiyor.");
		}
		if (employeeDao.existsByEmail(employee.getEmail())) {
			return new ErrorResult(employee.getEmail() + " adresine ait hesap var.");
		}
		if (employeeDao.existsByNationalIdentity(employee.getNationalIdentity())) {
			return new ErrorResult(employee.getNationalIdentity() + "tc numarasına sahip hesap var.");
		}

		if(!this.emailVerification.verify(employee)) {
			return new ErrorResult("Lütfen mail adresini onaylayınız.");
			}
		if(!this.mernisVerification.verify(employee)) { 
			return new ErrorResult("Bilgilerinizi kontrol ediniz merniste kaydınız bulunamamıstır.");
		}
		return new SuccessDataResult<Employee>(employee,"Basarı ile kontrol edildi.");

	}

}
