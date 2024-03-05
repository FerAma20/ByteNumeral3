package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.EmpresaRepository;
import com.example.demo.models.entity.Empresa;

@Service
public class EmpresaServiceImpl implements IEmpresaService{
	
	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Empresa> findAll() {
		return (List<Empresa>) empresaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Empresa findById(Long id) {
		return empresaRepository.findById(id).orElse(null);
	}

	@Override
	public boolean saveBussines(Empresa empresa) {
		try {
			empresaRepository.save(empresa);
			return true;
		}catch(Exception e) 
		{
			return false;
		}
	}
	
	@Override
	public boolean updateBussines(Empresa empresa) {
		try {
			empresaRepository.save(empresa);
			return true;
		}catch(Exception e) 
		{
			return false;
		}
	}

	@Override
	public boolean deleteById(Long id) {
		try {
			empresaRepository.deleteById(id);
			return true;
		}catch(Exception e) 
		{
			return false;
		}
	}

}
