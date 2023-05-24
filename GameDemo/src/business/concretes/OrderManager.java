package business.concretes;

import business.Utils;
import business.abstracts.OrderService;
import enitities.concretes.Campaign;
import enitities.concretes.Customer;
import enitities.concretes.Game;

public class OrderManager implements OrderService{

	@Override
	public void order(Customer customer, Game game, Campaign campaign) {
		if(Utils.checkIfCampaignComplies(customer, campaign))
		{
			System.out.println(game.getName()+" Succesfully ordered by "+customer.getFirstName()+" with discount"+
					(game.getPrice()-game.getPrice()*campaign.getDiscount()/100));
		}
		else 
		{
			System.out.println(game.getName()+" Succesfully ordered by "+customer.getFirstName()+" without discount");
		}
	}



}
