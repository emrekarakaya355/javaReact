package com.example.hrms.business.rules.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.hrms.business.rules.abstracts.UserRule;
import com.example.hrms.business.verifications.abstracts.UserVerification;
import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;

@Service
public class EmployerRule implements UserRule<Employer>{
	
	 @Autowired
	 @Qualifier("emailVerification") private UserVerification<Employer> emailVerification;
	 
	
	@Autowired
	private EmployerDao employerDao;
	
	@Override
	public Result checkUser(Employer employer) {
		if(employer.getCompanyName()==null||employer.getEmail()==null||employer.getPassword()==null||
				employer.getPhoneNumber()==null||employer.getWebAddress()==null) {
			return new ErrorResult("Bütün alanları doldurmanız gerekiyor.");
		}
		
		if(!employer.getWebAddress().equals(splitDomainName(employer.getEmail()))) {
			return new ErrorResult("web adresi ile aynı domaina sahip email gerekiyor.");
		}
		if(employerDao.existsByEmail(employer.getEmail())) {
			
			return new ErrorResult("email adresine ait bir hesap var.");
		}
		
		
		if(!this.emailVerification.verify(employer)) {
			return new ErrorResult("Lütfen mail adresini onaylayınız."); 
		}
		 
		
		return new SuccessDataResult<Employer>(employer,"basarı ile eklendi.");
	}

	private String splitDomainName(String str )
	{
		String finalOutput = "";
		String arrayOfStr[] = str.split("@");
		if (arrayOfStr.length == 2) {
			finalOutput = arrayOfStr[1];
		}
		return finalOutput;	
	}
}
