package com.example.demo.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AbsenceDaoRepo;
import com.example.demo.persistance.entities.AfpaAbsence;


@Service
@Transactional
public class AbsenceServiceImpl implements AbsenceService{

	@Autowired
	private AbsenceDaoRepo absenceRepo;
	
	public AbsenceDaoRepo getAbsenceRepo() {
		return absenceRepo;
	}

	public void setAbsenceRepo(AbsenceDaoRepo absenceRepo) {
		this.absenceRepo = absenceRepo;
	}

	@Override
	public void add(AfpaAbsence afpaAbsence) {
		// TODO Auto-generated method stub
		absenceRepo.save(afpaAbsence);
	}

	@Override
	public void delete(AfpaAbsence afpaAbsence) {
		// TODO Auto-generated method stub
		absenceRepo.delete(afpaAbsence);
	}

	@Override
	public AfpaAbsence update(AfpaAbsence afpaAbsence) {
		// TODO Auto-generated method stub
		return absenceRepo.save(afpaAbsence);
	}

	@Override
	public List<AfpaAbsence> findAll() {
		// TODO Auto-generated method stub
		return (List<AfpaAbsence>) absenceRepo.findAll();
	}

	@Override
	public AfpaAbsence findByIdabsence(BigDecimal idabsence) {
		// TODO Auto-generated method stub
		return absenceRepo.findById(idabsence).get();
	}



}
