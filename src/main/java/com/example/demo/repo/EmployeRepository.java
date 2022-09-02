package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long>{
	
	public Employe findEmployeById(Long id) ;
	public List<Employe> findEmployeBynom(String nom);

}
