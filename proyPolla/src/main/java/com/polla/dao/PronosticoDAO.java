package com.polla.dao;

import java.util.Date;
import java.util.List;

import com.polla.domain.Pais;
import com.polla.domain.Partido;
import com.polla.domain.Pronostico;

public interface PronosticoDAO {

	List<Partido> consultaPartido(Date fecha) throws Exception ;
	Pronostico registrarPronostico(Pronostico pronostico) throws Exception ;
	List<Pais>  listarPaises() throws Exception ;
	Pronostico getPronostico(Pais pais) throws Exception ;
	
}
