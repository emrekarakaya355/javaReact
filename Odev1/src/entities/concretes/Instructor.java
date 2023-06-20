package entities.concretes;

import entities.abstracts.User;

public class Instructor extends User {
	private String courseName;

	public Instructor(int id, String name, String courseName) {
		super(id, name);
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
