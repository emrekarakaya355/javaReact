package enitities.concretes;


import enitities.abstracts.Entity;

public class Customer implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private String natioanalIdentity;
	private String dateOfBirty;
	public Customer(int id, String firstName, String lastName, String natioanalIdentity, String string) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.natioanalIdentity = natioanalIdentity;
		this.dateOfBirty = string;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getNatioanalIdentity() {
		return natioanalIdentity;
	}
	public String getDateOfBirty() {
		return dateOfBirty;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setNatioanalIdentity(String natioanalIdentity) {
		this.natioanalIdentity = natioanalIdentity;
	}
	public void setDateOfBirty(String dateOfBirty) {
		this.dateOfBirty = dateOfBirty;
	}
	
}
