package business;

import enitities.concretes.Campaign;
import enitities.concretes.Customer;

public class Utils {

	public static boolean checkIfCampaignComplies(Customer customer,Campaign campaign) {
		if(customer.getAge()>campaign.getAgeLowerLimit() && customer.getAge()<campaign.getAgeUpperLimit()) 
		{
			return true;
		}
		return false;
	}
}
