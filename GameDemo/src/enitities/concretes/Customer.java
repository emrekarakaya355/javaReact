package enitities.concretes;

import java.time.LocalDate;

import enitities.abstracts.Entity;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private LocalDate dayOfBirth;

	public Customer(int id, String firstName, String lastName, String nationalIdentity, LocalDate dayOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.dayOfBirth = dayOfBirth;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public int getAge() {
		return LocalDate.now().getYear()-dayOfBirth.getYear();
	}


}
