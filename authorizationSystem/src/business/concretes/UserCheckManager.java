package business.concretes;

import java.util.regex.Pattern;

import business.abstracts.UserCheckServices;
import entities.concretes.User;

public class UserCheckManager implements UserCheckServices{
	private String regexPattern="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	@Override
	public boolean checkUserRules(User user) throws Exception {
		// TODO Auto-generated method stub
		if(checkEmail(user.getEmail())
				&& checkPassword(user.getPassword())
				&& checkName(user.getName(),user.getLastName())) return true;
		return false;
	}
	
	private boolean checkEmail(String email) throws Exception{
		
		if(email.isEmpty()) throw new Exception("E-posta boþ olamaz");
		if(!Pattern.compile(regexPattern).matcher(email).matches()) throw new Exception("E-posta adresi giriniz");
		return true;	
	}
	private boolean checkPassword(String password) throws Exception{
		if(password.length()<6) throw new Exception("password 6 karakterden uzun olmalýdýr.");	
		return true;
		
	}
	private boolean checkName(String name,String lastName) throws Exception {
		if(name.length()>1 && lastName.length()>1) return true;
		else {
			throw new Exception("Isim Soyisim en az 2 karakterden oluþmalýdýr");
		}
		
		
		
		
		
		
	}

}
