package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("CONTRACT_EMPLOYEE")
public class ContractEmployee extends Employee {
	private int dailyRate;

	public ContractEmployee(String name,int dailyRate) {
		super(name);
		this.dailyRate = dailyRate;
	}
	
	
}
