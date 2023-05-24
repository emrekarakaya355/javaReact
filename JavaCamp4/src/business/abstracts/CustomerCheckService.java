package business.abstracts;

import enitities.concretes.Customer;

public interface CustomerCheckService {
	
	boolean checkIfPersonReal(Customer customer);

}
