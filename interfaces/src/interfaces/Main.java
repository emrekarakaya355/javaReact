package interfaces;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers = {new FileLogger(),new DatabaseLogger()};

		
		
		CustomerManager customerManager =new CustomerManager(loggers);
		Customer emre =new Customer(1,"emre","Karakaya");
		customerManager.add(emre);
	}

}
