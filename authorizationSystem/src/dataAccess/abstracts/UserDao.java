package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void add(User user);
	User get(String email);
	List<User> getAll();
	boolean checkEmail(String email);

}
