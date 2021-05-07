package com.example.demo.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.persistance.entities.AfpaEmployeweb;

public interface EmployeDaoRepo extends JpaRepository<AfpaEmployeweb, BigDecimal>{

}
