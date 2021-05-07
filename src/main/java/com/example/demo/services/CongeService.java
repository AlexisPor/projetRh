package com.example.demo.services;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.persistance.entities.AfpaConge;



public interface CongeService {

	public void add(AfpaConge afpaConge);
	
	public void delete(AfpaConge afpaConge);
	
	public AfpaConge update(AfpaConge afpaConge);
	
	public List<AfpaConge> findAll();
	
	AfpaConge findByRefConge(BigDecimal refconge);
}
