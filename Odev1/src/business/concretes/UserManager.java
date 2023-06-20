package business.concretes;

import business.abstracts.UserService;
import entities.abstracts.User;

public class UserManager implements UserService{
	@Override
	public void add(User user) {
		System.out.println(user.getName()+"eklendi");
	}

}
