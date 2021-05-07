package com.example.demo.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeDaoRepo;
import com.example.demo.persistance.entities.AfpaEmployeweb;


@Service
@Transactional
public class EmployeServiceImpl implements EmployeService{

	@Autowired
	private EmployeDaoRepo employeRepo;
	
	public EmployeDaoRepo getEmployeRepo() {
		return employeRepo;
	}

	public void setEmployeRepo(EmployeDaoRepo employeRepo) {
		this.employeRepo = employeRepo;
	}

	@Override
	public void add(AfpaEmployeweb afpaEmployeweb) {
		// TODO Auto-generated method stub
		employeRepo.save(afpaEmployeweb);
	}

	@Override
	public void delete(AfpaEmployeweb afpaEmployeweb) {
		// TODO Auto-generated method stub
		employeRepo.delete(afpaEmployeweb);
	}

	@Override
	public AfpaEmployeweb update(AfpaEmployeweb afpaEmployeweb) {
		// TODO Auto-generated method stub
		return employeRepo.save(afpaEmployeweb);
	}

	@Override
	public List<AfpaEmployeweb> findAll() {
		// TODO Auto-generated method stub
		return (List<AfpaEmployeweb>) employeRepo.findAll();
	}

	@Override
	public AfpaEmployeweb findByCode(BigDecimal code) {
		// TODO Auto-generated method stub
		return employeRepo.findById(code).get();
	}

}
