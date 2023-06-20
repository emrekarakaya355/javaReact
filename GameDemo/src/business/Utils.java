<<<<<<< HEAD
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
=======
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
>>>>>>> 766ce946a67b00f030c2779a845b7c7cbaa82972
