package enitities.concretes;

import enitities.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private int discount;
	private int ageLowerLimit;
	private int ageUpperLimit;

	public Campaign(int id,String campaignName, int discount, int ageLowerLimit, int ageUpperLimit) {
		this.id=id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.ageLowerLimit = ageLowerLimit;
		this.ageUpperLimit = ageUpperLimit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getAgeLowerLimit() {
		return ageLowerLimit;
	}
	public void setAgeLowerLimit(int ageLowerLimit) {
		this.ageLowerLimit = ageLowerLimit;
	}
	public int getAgeUpperLimit() {
		return ageUpperLimit;
	}
	public void setAgeUpperLimit(int ageUpperLimit) {
		this.ageUpperLimit = ageUpperLimit;
	}
	

}
