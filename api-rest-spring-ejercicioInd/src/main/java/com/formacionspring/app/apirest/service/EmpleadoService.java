package com.formacionspring.app.apirest.service;

import java.util.List;

import com.formacionspring.app.apirest.entity.Empleado;

public interface EmpleadoService {

	public List<Empleado> findAll();
	
	public Empleado findById(Long id);
	
	
	public Empleado save(Empleado empleado);
	
	
	public void delete(Long id);
	
}
