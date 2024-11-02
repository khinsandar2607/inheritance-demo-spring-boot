package com.example.demo.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class CompanyEmployee extends Employee{
	
	private int vacationDay;

	public CompanyEmployee(String name, int vacationDay) {
		super(name);
		this.vacationDay = vacationDay;
	}
	
}
