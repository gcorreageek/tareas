package com.polla.domain;

import java.io.Serializable;
import java.util.Date;

public class Partido implements Serializable{
 
	private static final long serialVersionUID = 5289154356721251302L;
	private Integer idPartido;
	private Date fecha;
	private Integer idPais1;
	private Integer idPais2;
	
	private Pais pais1;
	private Pais pais2;
	
	public Integer getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(Integer idPartido) {
		this.idPartido = idPartido;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Pais getPais1() {
		return pais1;
	}
	public void setPais1(Pais pais1) {
		this.pais1 = pais1;
	}
	public Pais getPais2() {
		return pais2;
	}
	public void setPais2(Pais pais2) {
		this.pais2 = pais2;
	}
	public Integer getIdPais1() {
		return idPais1;
	}
	public void setIdPais1(Integer idPais1) {
		this.idPais1 = idPais1;
	}
	public Integer getIdPais2() {
		return idPais2;
	}
	public void setIdPais2(Integer idPais2) {
		this.idPais2 = idPais2;
	}
 
	
	
	
	
	
}
