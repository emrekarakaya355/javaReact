package business.concretes;

import java.util.List;

import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import dataAccess.abstracts.CustomerDao;
import enitities.concretes.Customer;

public class CustomerManager implements CustomerService {
	private CustomerCheckService customerCheckService;
	private CustomerDao customerDao;
	public CustomerManager(CustomerCheckService customerCheckService, CustomerDao customerDao) {
		this.customerCheckService=customerCheckService;
		this.customerDao=customerDao;
	}
	
	@Override
	public void add(Customer customer) {
		if(!customerCheckService.checkIfCustomerReal(customer)) {
			System.out.println(customer.getFirstName()+" gercek bir kisi degil");
			
			//Customer Data access layer
			customerDao.add(customer);
			
			return;
		}
		System.out.println(customer.getFirstName()+" eklendi");
		
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
