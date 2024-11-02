package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("PARTTIME_EMPLOYEE")
public class PartTimeEmployee extends CompanyEmployee{
	
	private double hourRate;

	public PartTimeEmployee(String name, int vacationDay, double hourRate) {
		super(name, vacationDay);
		this.hourRate = hourRate;
	}


	
	

	
	
}
