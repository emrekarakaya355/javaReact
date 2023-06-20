package com.example.hrms.entities.abstracts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BaseUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	protected int id;
	
	@Column(name = "email")
	protected String email;
	
	@Column(name="password")
	protected String password;
	
	public boolean anyNull() {
		if(email==null) return true;
		if(password==null) return true;
		return false;
	}

}
