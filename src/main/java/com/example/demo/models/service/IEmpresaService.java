package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Empresa;

public interface IEmpresaService {

	public List<Empresa> findAll();
	public Empresa findById(Long id);
	public boolean saveBussines(Empresa empresa);
	public boolean updateBussines(Empresa empresa);
	public boolean deleteById(Long id);
	
}
