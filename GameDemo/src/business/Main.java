package business;

import java.time.LocalDate;

import adapters.concretes.MernisServiceAdapter;
import business.abstracts.CustomerService;
import business.abstracts.OrderService;
import business.concretes.CustomerManager;
import business.concretes.OrderManager;
import dataAccess.concretes.hibernateCustomerDao;
import enitities.concretes.Campaign;
import enitities.concretes.Customer;
import enitities.concretes.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		
		Customer emre = new Customer(0,"Emre","Karakaya", "111111", LocalDate.of(1995, 1, 1));
		Customer erhan = new Customer(1,"Erhan","Karakaya", "22222", LocalDate.of(1985, 1, 1));
		
		Campaign genc = new Campaign(0, "genc", 10, 20, 30);
		Campaign orta = new Campaign(1, "orta", 5, 30, 40);
		
		Game futbol = new Game(0,"Futbol", 2500);
		Game basket = new Game(1,"Basketbol",5000);
		
		//mernis ile Customer ekleme ve hibernate dao ile ekleme.
		CustomerService customerService=new CustomerManager(new MernisServiceAdapter(),new hibernateCustomerDao());
		customerService.add(emre);
		customerService.add(erhan);
		
		//
		OrderService orderService = new OrderManager();
		orderService.order(emre, futbol, genc);
		orderService.order(erhan, basket, genc);
		orderService.order(erhan, futbol, orta);
	}

}
