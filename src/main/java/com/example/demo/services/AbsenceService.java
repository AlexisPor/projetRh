package com.example.demo.services;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.persistance.entities.AfpaAbsence;


public interface AbsenceService {
	
	public void add(AfpaAbsence afpaAbsence);
	
	public void delete(AfpaAbsence afpaAbsence);
	
	public AfpaAbsence update(AfpaAbsence afpaAbsence);
	
	public List<AfpaAbsence> findAll();
	
	AfpaAbsence findByIdabsence(BigDecimal idabsence);

}
