package com.formacionspring.app.apirest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspring.app.apirest.dao.LoginDao;
import com.formacionspring.app.apirest.entity.Login;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDao servicio;
	
	@Override
	public Login findUserByDniAndContraseña(String dni, String contraseña) {
		
		return servicio.findUserByDniAndContraseña(dni, contraseña);
	}

}
