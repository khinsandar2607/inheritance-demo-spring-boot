package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ContractEmployee;
import com.example.demo.entity.FullTimeEmployee;
import com.example.demo.entity.PartTimeEmployee;
import com.example.demo.repository.ContractEmployeeRepository;
import com.example.demo.repository.FullTimeEmployeeRepository;
import com.example.demo.repository.PartTimeEmployeeRepository;

import jakarta.transaction.Transactional;

@Service

public class EmployeeService {
	@Autowired
	private ContractEmployeeRepository contractEmployeeRepository;
	@Autowired
	private FullTimeEmployeeRepository fullTimeEmployeeRepository;
	@Autowired
	private PartTimeEmployeeRepository partTimeEmployeeRepository;
	
	@Transactional
	public void createDb() {
		ContractEmployee contractEmployee1 = new ContractEmployee("John Doe", 2000);
		ContractEmployee contractEmployee2 = new ContractEmployee("John William", 3000);
		FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("James William", 10, 2000L);
		FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("Ben King ", 10 ,2500L);
		PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Salrlet Witch", 1, 100);
		PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Herry", 1, 110);
		
		contractEmployeeRepository.save(contractEmployee1);
		contractEmployeeRepository.save(contractEmployee2);
		
		fullTimeEmployeeRepository.save(fullTimeEmployee1);
		fullTimeEmployeeRepository.save(fullTimeEmployee2);
		
		partTimeEmployeeRepository.save(partTimeEmployee1);
		partTimeEmployeeRepository.save(partTimeEmployee2);
	}
}

