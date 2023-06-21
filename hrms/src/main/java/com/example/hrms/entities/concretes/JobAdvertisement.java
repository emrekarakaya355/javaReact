package com.example.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="job_requirements")
	private List<String> jobRequirements;
	
	@Column(name="city")
	private String city;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="number_to_hired")
	private int numberToHired;
	
	@Column(name="application_deadline")
	private Date  applicationDeadline;
	
	@OneToOne
	private JobPosition jobPosition;
	
	@ManyToOne
	private Employer employer;

}
