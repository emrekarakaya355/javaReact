package business.concretes;

import business.abstracts.VerificationServices;

public class EmailVerifierManager implements VerificationServices{

	@Override
	public boolean verify(String email) {
		// TODO Auto-generated method stub
		System.out.println("Lütfen "+email+"'ne gelen linke tıklayınız.");
		return true;
	}

	

}
