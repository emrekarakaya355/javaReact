package business.concretes;

import business.abstracts.BaseCustomerManager;
import business.abstracts.CustomerCheckService;
import enitities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		if(customerCheckService.checkIfPersonReal(customer)) {
		
		super.save(customer);
		}else {
			System.out.println("kaydedilemedi");
		}
	}


}
