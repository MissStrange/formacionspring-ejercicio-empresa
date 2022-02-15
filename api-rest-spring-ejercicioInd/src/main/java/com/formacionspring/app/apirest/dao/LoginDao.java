package com.formacionspring.app.apirest.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionspring.app.apirest.entity.Login;

@Repository
public interface LoginDao extends CrudRepository<Login, Long>{

	@Query("SELECT u FROM Login u WHERE u.dni = ?1 and u.contraseña = ?2")
	public Login findUserByDniAndContraseña(String dni, String contraseña);

}
