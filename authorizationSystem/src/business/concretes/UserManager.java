package business.concretes;


import business.abstracts.UserCheckServices;
import business.abstracts.UserServices;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserServices {
	UserCheckServices userCheckServices;
	UserDao userDao;
	public UserManager(UserCheckServices userCheckServices,	UserDao userDao) {
		this.userCheckServices = userCheckServices;
		this.userDao = userDao;
	}

	@Override
	public void register(User user) throws Exception {
		// TODO Auto-generated method stub
		if(userDao.checkEmail(user.getEmail())) {
			System.out.println(user.getId()+" "+user.getEmail()+" is already in use. Please try a different email address.");
			return;
		}
		if(userCheckServices.checkUserRules(user)) {
			userDao.add(user);
			System.out.println(user.getId()+" succesfully registered.");
		}
		
	}

	@Override
	public void login(String email, String password) throws Exception{
		// TODO Auto-generated method stub
		if(email.isBlank() || password.isBlank()) throw new Exception("Email or Password can not be empty!");
		if( userDao.get(email).getPassword().equals(password)) {
			System.out.println("Succesfully login.");
		}
		
	}


}
