import business.abstracts.BaseCustomerManager;
import business.concretes.CustomerCheckManager;
import business.concretes.StarbucksCustomerManager;
import enitities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.save(new Customer(0,"emre", "karakaya","19435924164", "19,08,1995"));
		

	}

}
