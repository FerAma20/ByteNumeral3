package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, Long>{

}
