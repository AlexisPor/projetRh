package com.example.demo.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.SanctionDaoRepo;
import com.example.demo.persistance.entities.AfpaSanction;


@Service
@Transactional
public class SanctionServiceImpl implements SanctionService{

	@Autowired
	private SanctionDaoRepo sanctionRepo;
	
	public SanctionDaoRepo getSanctionRepo() {
		return sanctionRepo;
	}

	public void setSanctionRepo(SanctionDaoRepo sanctionRepo) {
		this.sanctionRepo = sanctionRepo;
	}

	@Override
	public void add(AfpaSanction afpaSanction) {
		// TODO Auto-generated method stub
		sanctionRepo.save(afpaSanction);
	}

	@Override
	public void delete(AfpaSanction afpaSanction) {
		// TODO Auto-generated method stub
		sanctionRepo.delete(afpaSanction);
	}

	@Override
	public AfpaSanction update(AfpaSanction afpaSanction) {
		// TODO Auto-generated method stub
		return sanctionRepo.save(afpaSanction);
	}

	@Override
	public List<AfpaSanction> findAll() {
		// TODO Auto-generated method stub
		return (List<AfpaSanction>) sanctionRepo.findAll();
	}

	@Override
	public AfpaSanction findByRefSanction(BigDecimal refsanction) {
		// TODO Auto-generated method stub
		return sanctionRepo.findById(refsanction).get();
	}

}
