<<<<<<< HEAD
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
=======
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
>>>>>>> 766ce946a67b00f030c2779a845b7c7cbaa82972
