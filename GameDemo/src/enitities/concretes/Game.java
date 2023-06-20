<<<<<<< HEAD
package enitities.concretes;

import enitities.abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private int price;
	public Game(int id,String name, int price) {
		this.id=id;
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
=======
package enitities.concretes;

import enitities.abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private int price;
	public Game(int id,String name, int price) {
		this.id=id;
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
>>>>>>> 766ce946a67b00f030c2779a845b7c7cbaa82972
