package com.polla.service;

import java.util.List;

import com.polla.domain.Pais;
import com.polla.domain.Partido;
import com.polla.domain.Pronostico;


public interface PronosticoService {

//	PronosticoDAO dao = new PronosticoDAOImpl();
	
	Partido[] consultaPartido(String fecha)   ;
	Pronostico registrarPronostico(Integer idPartido, Integer resultadoPais1, Integer resultadoPais2 )  ;
	Pais[]  listarPaises()  ;
	Pronostico getPronostico(Integer idPais)   ;
	
	
}
