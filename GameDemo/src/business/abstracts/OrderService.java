package business.abstracts;

import enitities.concretes.Campaign;
import enitities.concretes.Customer;
import enitities.concretes.Game;

public interface OrderService {
	void order(Customer customer,Game game, Campaign campaign);

}
