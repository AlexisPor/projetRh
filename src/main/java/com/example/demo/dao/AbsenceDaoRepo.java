package com.example.demo.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.entities.AfpaAbsence;

public interface AbsenceDaoRepo extends JpaRepository<AfpaAbsence, BigDecimal>{

	

}
