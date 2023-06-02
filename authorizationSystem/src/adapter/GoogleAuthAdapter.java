package adapter;

import business.abstracts.UserCheckServices;
import business.abstracts.UserServices;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;
import google.GoogleAuth;

public class GoogleAuthAdapter implements UserServices{


	private GoogleAuth googleAuth;
	private UserCheckServices userCheckServices;
	public GoogleAuthAdapter( UserCheckServices userCheckServices) {
		super();
		this.googleAuth = new GoogleAuth();
		this.userCheckServices = userCheckServices;
	}

	@Override
	public void register(User user) throws Exception {
		// TODO Auto-generated method stub
		if(userCheckServices.checkUserRules(user)) {
		googleAuth.signUp(user.getEmail(), user.getPassword());
		
		}
	}

	@Override
	public void login(String email, String password) throws Exception {
		googleAuth.signIn(email,password);
		
	}

}
