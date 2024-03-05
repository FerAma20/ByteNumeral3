package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Id;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable{

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	private String nombre;
	private String nit;
	private Date fecha_fundacion;
	
	@Temporal(TemporalType.DATE)
	private String direccion;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public Date getFecha_fundacion() {
		return fecha_fundacion;
	}
	public void setFecha_fundacion(Date fecha_fundacion) {
		this.fecha_fundacion = fecha_fundacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
