package com.polla.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

import com.polla.dao.PronosticoDAO;
import com.polla.dao.PronosticoDAOImpl;
import com.polla.domain.Pais;
import com.polla.domain.Partido;
import com.polla.domain.Pronostico;
import com.polla.util.Utiles;
@WebService 
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class PronosticoServiceImpl implements PronosticoService {

	PronosticoDAO dao = new PronosticoDAOImpl();
	
	@WebMethod(operationName = "consultaPartido")
	@Override
	public Partido[] consultaPartido(@WebParam(name="fecha") String fecha) {
		List<Partido> lPartido = null;
		Date date = Utiles.stringToDate(fecha);
		try {
			lPartido = dao.consultaPartido(date);
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return lPartido.toArray(new Partido[]{new Partido()});
	}

	@WebMethod(operationName = "registrarPronostico")
	@Override
	public Pronostico registrarPronostico(@WebParam(name="idPartido") Integer idPartido,
			@WebParam(name="resultadoPais1") Integer resultadoPais1,@WebParam(name="resultadoPais2") Integer resultadoPais2 ) {
		Pronostico pronostico = new Pronostico();
		pronostico.setIdPartido(idPartido);
		System.out.println("p1:"+resultadoPais1);
		System.out.println("p2:"+resultadoPais2);
		if(resultadoPais1.equals(resultadoPais2)){
			pronostico.setEstadoPais(0);//empata
		}else{
			if (resultadoPais1 < resultadoPais2) {
				pronostico.setEstadoPais(1);// pierdes
			} else {
				pronostico.setEstadoPais(2);// gana
			}
		}
		
		pronostico.setResultadoPais1(resultadoPais1.toString());
		pronostico.setResultadoPais2(resultadoPais2.toString());
		
		try {
			dao.registrarPronostico(pronostico);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pronostico;
	}

	@WebMethod(operationName = "listarPaises")
	@Override
	public Pais[] listarPaises() {
		List<Pais> lPais = null;
		try {
			 lPais = dao.listarPaises();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lPais.toArray(new Pais[]{new Pais()});
	}

	@WebMethod(operationName = "getPronostico")
	@Override
	public Pronostico getPronostico(@WebParam(name="idPais") Integer idPais) {
		Pronostico pronostico = new Pronostico();
		Pais pais = new Pais();
		pais.setIdPais(idPais);
		try {
			pronostico = dao.getPronostico(pais);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pronostico;
	}

	
	
//	public static void main(String[] args) {
//		System.out.println("Here we go!");
//        Endpoint.publish("http://localhost:8080/proy", new PronosticoServiceImpl());
//        System.out.println("Yeahh!");
//    }
}
