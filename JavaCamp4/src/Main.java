import java.time.LocalDate;
import adapters.MernisServiceAdapter;
import business.abstracts.BaseCustomerManager;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;
import enitities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1, "a","a", "2", LocalDate.of(9999, 9, 9)));
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();
		baseCustomerManager2.save(new Customer(1, "a","a", "2", LocalDate.of(9999, 9, 9)));
		
	}

}
