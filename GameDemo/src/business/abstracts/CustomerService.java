package business.abstracts;

import java.util.List;
import enitities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	Customer getById(int id);
	List<Customer> getAll();

}
