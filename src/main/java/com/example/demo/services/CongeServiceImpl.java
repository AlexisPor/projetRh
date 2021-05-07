package com.example.demo.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CongeDaoRepo;
import com.example.demo.persistance.entities.AfpaConge;


@Service
@Transactional
public class CongeServiceImpl implements CongeService {

	@Autowired
	private CongeDaoRepo congeRepo;
	
	public CongeDaoRepo getCongeRepo() {
		return congeRepo;
	}

	public void setCongeRepo(CongeDaoRepo congeRepo) {
		this.congeRepo = congeRepo;
	}

	@Override
	public void add(AfpaConge afpaConge) {
		// TODO Auto-generated method stub
		congeRepo.save(afpaConge);
	}

	@Override
	public void delete(AfpaConge afpaConge) {
		// TODO Auto-generated method stub
		congeRepo.delete(afpaConge);
	}

	@Override
	public AfpaConge update(AfpaConge afpaConge) {
		// TODO Auto-generated method stub
		return congeRepo.save(afpaConge);
	}

	@Override
	public List<AfpaConge> findAll() {
		// TODO Auto-generated method stub
		return (List<AfpaConge>) congeRepo.findAll();
	}

	@Override
	public AfpaConge findByRefConge(BigDecimal refconge) {
		// TODO Auto-generated method stub
		return congeRepo.findById(refconge).get();
	}

}
