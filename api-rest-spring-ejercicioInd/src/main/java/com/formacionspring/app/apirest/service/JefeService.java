package com.formacionspring.app.apirest.service;

import java.util.List;

import com.formacionspring.app.apirest.entity.Jefe;

public interface JefeService {

	public List<Jefe> findAll();
	
	public Jefe findById(Long id);
	
	public Jefe save(Jefe jefe);
	
	public void delete(Long id);
}
