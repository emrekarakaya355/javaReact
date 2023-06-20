package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserServices {
	
	void register(User user) throws Exception;
	void login(String email,String password) throws Exception;
	
	
}
