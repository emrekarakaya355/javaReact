package dataAccess.abstracts;

import java.util.List;

import enitities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer getById(int id);
	List<Customer> getAll();
}
