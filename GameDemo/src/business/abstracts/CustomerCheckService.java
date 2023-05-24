package business.abstracts;

import enitities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfCustomerReal(Customer customer);

}
