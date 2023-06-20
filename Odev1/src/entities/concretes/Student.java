package entities.concretes;

import entities.abstracts.User;

public class Student extends User {
	

	String studentNumber;
	
	
	public Student(int id,String name, String studentNumber) {
		super(id, name);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
}
