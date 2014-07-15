package com.polla.domain;

import java.io.Serializable;

public class Pais implements Serializable {
 
	private static final long serialVersionUID = 5285756605980230594L;
	private Integer idPais;
	private String nombre;
	private String ruta;
	
	
	public Integer getIdPais() {
		return idPais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	
	
	
	
}
