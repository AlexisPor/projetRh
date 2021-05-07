package com.example.demo.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.entities.AfpaConge;


public interface CongeDaoRepo extends JpaRepository<AfpaConge, BigDecimal>{

}
