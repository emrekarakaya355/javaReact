package com.example.hrms.entities.concretes;

import com.example.hrms.entities.abstracts.BaseUser;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "company_id")
@Table(name="employers")
public class Employer extends BaseUser{
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_adress")
	private String webAddress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	

}
