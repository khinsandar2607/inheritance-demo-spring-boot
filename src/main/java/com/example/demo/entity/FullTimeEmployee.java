package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@DiscriminatorValue("FULLTIME_EMPLOYEE")
public class FullTimeEmployee extends CompanyEmployee {
	
	private Long salary;

	public FullTimeEmployee(String name, int vacationDay, Long salary) {
		super(name, vacationDay);
		this.salary = salary;
	}

	
}
