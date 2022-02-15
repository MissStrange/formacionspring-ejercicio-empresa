package com.formacionspring.app.apirest.service;

import java.util.List;

import com.formacionspring.app.apirest.entity.Departamento;


public interface DepartamentoService {

	public List<Departamento> findAll();
	
	public Departamento findById(Long id);
	
	public Departamento save(Departamento departamento);
	
	public void delete(Long id);
}
