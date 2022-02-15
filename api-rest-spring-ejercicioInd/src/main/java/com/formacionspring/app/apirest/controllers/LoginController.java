package com.formacionspring.app.apirest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formacionspring.app.apirest.dao.LoginDao;
import com.formacionspring.app.apirest.entity.Login;

@RestController
public class LoginController {

	@Autowired
	private LoginDao servicio;
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUsuario(@RequestBody Login login) {
		Login loginNew = null;
		Map<String, Object> response = new HashMap<>();
		try {

			loginNew = servicio.findUserByDniAndContraseña(login.getDni(), login.getContraseña());
			
			if(loginNew != null) {
				
				response.put("mensaje", "El empleado ha sido creado con éxito!");
				response.put("login", loginNew);				
			} else {
				
				response.put("mensaje", "Usuario o contraseña incorrectos");
				response.put("login", loginNew);
				
			}
			
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat("_").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}
}
