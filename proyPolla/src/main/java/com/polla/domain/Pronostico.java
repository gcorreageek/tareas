package com.polla.domain;

import java.io.Serializable;

public class Pronostico implements Serializable {
 
	private static final long serialVersionUID = -6104140925133303181L;
	private Integer idPronostico;
	private Integer idPartido;
	private String resultadoPais1;
	private String resultadoPais2;
	private Integer estadoPais;
	
	private Integer estadoEmpate;
	private Integer estadoPerdio;
	private Integer estadoGano;
	
	
	
	private Partido partido;
	
	
	
	public Integer getIdPronostico() {
		return idPronostico;
	}
	public void setIdPronostico(Integer idPronostico) {
		this.idPronostico = idPronostico;
	}
	public Integer getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(Integer idPartido) {
		this.idPartido = idPartido;
	}
	public String getResultadoPais1() {
		return resultadoPais1;
	}
	public void setResultadoPais1(String resultadoPais1) {
		this.resultadoPais1 = resultadoPais1;
	}
	public String getResultadoPais2() {
		return resultadoPais2;
	}
	public void setResultadoPais2(String resultadoPais2) {
		this.resultadoPais2 = resultadoPais2;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public Integer getEstadoEmpate() {
		return estadoEmpate;
	}
	public void setEstadoEmpate(Integer estadoEmpate) {
		this.estadoEmpate = estadoEmpate;
	}
	public Integer getEstadoPerdio() {
		return estadoPerdio;
	}
	public void setEstadoPerdio(Integer estadoPerdio) {
		this.estadoPerdio = estadoPerdio;
	}
	public Integer getEstadoGano() {
		return estadoGano;
	}
	public void setEstadoGano(Integer estadoGano) {
		this.estadoGano = estadoGano;
	}
	public Integer getEstadoPais() {
		return estadoPais;
	}
	public void setEstadoPais(Integer estadoPais) {
		this.estadoPais = estadoPais;
	}
}
