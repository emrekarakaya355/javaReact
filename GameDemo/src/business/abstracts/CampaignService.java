package business.abstracts;

import java.util.List;

import enitities.concretes.Campaign;

public interface CampaignService {
	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	Campaign getById(int id);
	List<Campaign> getAll();
	
}
