package com.formacionspring.app.apirest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionspring.app.apirest.entity.Departamento;

@Repository
public interface DepartamentoDao extends CrudRepository<Departamento, Long>{

}
