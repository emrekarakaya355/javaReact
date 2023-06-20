import adapter.GoogleAuthAdapter;
import business.abstracts.UserServices;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import dataAccess.business.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User emre = new User(1,"emre","karakaya","emre@emre.com","123456");
		User emreTest1 = new User(2,"emre","karakaya","emre@emre.com","123456");
		User emreTest2 = new User(3,"emre","karakaya","emre","123456");
		User emreTest3 = new User(4,"emre","karakaya","emre54@emre.com","1");
		User emreTest4 = new User(5,"emre","k","e435mre@emre.com","123456");

		User google = new User(6,"google","google","google@google.com","123456");
		User googleTest = new User(7,"google","google","google@google.com","1234");
		User googleTest2 = new User(8,"google","google","google@google.com","123456");

		UserServices userServicesIn = new UserManager(new UserCheckManager(),new InMemoryUserDao());
		UserServices userServicesGoogleImp = new GoogleAuthAdapter(new UserCheckManager());

		try {
			userServicesIn.register(emre);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			userServicesIn.register(emreTest1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			userServicesIn.register(emreTest2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			userServicesIn.login("emre@emre.com", "123456");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}



		try {
			userServicesGoogleImp.register(google);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);		
		}
		try {
			userServicesGoogleImp.register(googleTest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);		
		}
		try {
			userServicesGoogleImp.register(googleTest2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);		
		}
		try {
			userServicesGoogleImp.login("google@google.com","123456");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);		
		}

	}

}
