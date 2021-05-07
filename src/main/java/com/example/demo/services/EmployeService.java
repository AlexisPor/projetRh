package com.example.demo.services;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.persistance.entities.AfpaEmployeweb;



public interface EmployeService {

	
	public void add(AfpaEmployeweb afpaEmployeweb);
	
	public void delete(AfpaEmployeweb afpaEmployeweb);
	
	public AfpaEmployeweb update(AfpaEmployeweb afpaEmployeweb);
	
	public List<AfpaEmployeweb> findAll();
	
	AfpaEmployeweb findByCode(BigDecimal code);
}
