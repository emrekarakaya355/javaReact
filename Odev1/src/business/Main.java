package business;

import business.abstracts.UserService;
import business.concretes.UserManager;
import entities.abstracts.User;
import entities.concretes.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User emre=new Student(0, "emre","15512");
		UserService userService = new UserManager();
		userService.add(emre);
	}

}
