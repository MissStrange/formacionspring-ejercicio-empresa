package com.formacionspring.app.apirest.service;

import com.formacionspring.app.apirest.entity.Login;

public interface LoginService{

	public Login findUserByDniAndContraseña(String dni, String contraseña);
}
