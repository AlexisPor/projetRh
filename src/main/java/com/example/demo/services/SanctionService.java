package com.example.demo.services;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.persistance.entities.AfpaSanction;



public interface SanctionService {

	
	public void add(AfpaSanction afpaSanction);
	
	public void delete(AfpaSanction afpaSanction);
	
	public AfpaSanction update(AfpaSanction afpaSanction);
	
	public List<AfpaSanction> findAll();
	
	AfpaSanction findByRefSanction(BigDecimal refsanction);
}
