package business.abstracts;

import entities.concretes.User;

public interface UserCheckServices {
	
	boolean checkUserRules(User user) throws Exception;
	
}
