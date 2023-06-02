package dataAccess.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	private Map<String,User> users;
	public InMemoryUserDao() {
		this.users = new HashMap<>() ;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		users.put(user.getEmail(),user);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<>(users.values());
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return users.containsKey(email);
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return users.get(email);
	}

}
