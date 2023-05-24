package business.concretes;

import business.abstracts.CustomerCheckService;
import enitities.concretes.Customer;
 
public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfPersonReal(Customer customer) {
		// TODO Auto-generated method stub
		return false;
		
	}
	

}
