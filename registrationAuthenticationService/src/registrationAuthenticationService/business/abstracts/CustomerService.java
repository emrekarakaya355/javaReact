package registrationAuthenticationService.business.abstracts;

import java.util.List;

import registrationAuthenticationService.entity.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer getById(int id);
	List<Customer> getAll();


}	
