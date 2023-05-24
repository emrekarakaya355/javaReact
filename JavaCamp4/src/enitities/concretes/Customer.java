package enitities.concretes;


import java.time.LocalDate;
import enitities.abstracts.Entity;

public class Customer implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private String natioanalIdentity;
	private LocalDate dateOfBirth;
	public Customer(int id, String firstName, String lastName, String natioanalIdentity, LocalDate dateOfBirth) {
		super();
		this.id = id; 	
		this.firstName = firstName;
		this.lastName = lastName;
		this.natioanalIdentity = natioanalIdentity;
		this.dateOfBirth = dateOfBirth;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
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
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
