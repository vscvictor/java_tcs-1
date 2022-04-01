package com.vsosapac.java_tcs1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vsosapac.java_tcs1.entity.model.Cuenta;

@Repository
public interface ICuentaRepository extends JpaRepository<Cuenta, Long>{
	
}