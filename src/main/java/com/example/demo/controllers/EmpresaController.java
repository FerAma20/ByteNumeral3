package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Empresa;
import com.example.demo.models.service.EmpresaServiceImpl;

@RestController
public class EmpresaController {

	@Autowired
	private EmpresaServiceImpl empresaService;
	
	@GetMapping("/listar")
	public List<Empresa> listar(){
		return empresaService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Empresa findById(@PathVariable Long id) {
		return empresaService.findById(id);
	}
	
	@PostMapping("/save")
	public boolean save(@RequestBody Empresa empresa) {
		return empresaService.saveBussines(empresa);
	}
	
	@PutMapping("/update")
	public boolean update(@RequestBody Empresa empresa) {
		return empresaService.updateBussines(empresa);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable Long id){
		return empresaService.deleteById(id);
	}

	
}
