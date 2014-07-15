package com.polla.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.polla.domain.Pais;
import com.polla.domain.Partido;
import com.polla.domain.Pronostico;
import com.polla.util.Utiles;

public class PronosticoDAOImpl implements PronosticoDAO {
	
	public static void main(String[] args) {
		PronosticoDAO p = new PronosticoDAOImpl();
		try {
			List<Partido> lPartido = p.consultaPartido(Utiles.stringToDate("2014-01-17 05:36:25"));
			for (Partido partido : lPartido) {
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://us-cdbr-cb-east-01.cleardb.net:3306/cb_polla_bd";
//	jdbc:mysql://us-cdbr-cb-east-01.cleardb.net:3306/cb_polla_bd

	// Database credentials
	static final String USER = "bc7aac9b902e50";
	static final String PASS = "319d9f3f";
	@Override
	public List<Partido> consultaPartido(Date fecha) throws Exception {
		   Connection conn = null;
		   Statement stmt = null;
		
		   List<Partido> lPartido = null;
		   
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		stmt = conn.createStatement();
		String sql;
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		String fechaasss = new StringBuilder().append(cal.get(Calendar.YEAR))
	    		  .append("-").append((cal.get(Calendar.MONTH)+1)+"".length()==1?"0"+(cal.get(Calendar.MONTH)+1):(cal.get(Calendar.MONTH)+1))
	    		  .append("-").append(cal.get(Calendar.DAY_OF_MONTH)).toString();
		sql = "select  p.id_partido,p.fecha,(select nombre from pais pais where p.id_pais1=pais.id_pais) 'pais1', "+
	    		  " (select ruta_imagen_web from pais pais where p.id_pais1=pais.id_pais) 'ruta_imagen1', "+
	    		  " (select nombre from pais pais where p.id_pais2=pais.id_pais) 'pais2', "+
	    		  " (select ruta_imagen_web from pais pais where p.id_pais2=pais.id_pais) 'ruta_imagen2' "+
	    		  " from partido p "
	    		  + " where date(p.fecha) = '"+fechaasss+"' ";
//		System.out.println(sql);
		final ResultSet rs = stmt.executeQuery(sql);
		lPartido = new ArrayList<Partido>();
		while (rs.next()) {
			final Partido partido = new Partido();
			partido.setIdPartido(rs.getInt("id_partido"));
			partido.setFecha(rs.getDate("fecha"));
			final Pais pais1 = new Pais();
			pais1.setNombre(rs.getString("pais1"));
			pais1.setRuta(rs.getString("ruta_imagen1"));
			partido.setPais1(pais1);
			final Pais pais2 = new Pais();
			pais2.setNombre(rs.getString("pais2"));
			pais2.setRuta(rs.getString("ruta_imagen2"));
			partido.setPais2(pais2);
			lPartido.add(partido);
		}
		rs.close();
		stmt.close();
		conn.close();
	 
		return lPartido;
	}

	@Override
	public Pronostico registrarPronostico(Pronostico pronostico) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		stmt = conn.createStatement();
//		insert into pronostico(id_partido,resultado_pais1,resultado_pais2,estado_pais1) values(1,1,1,0);
		String sql = " insert into pronostico(id_partido,resultado_pais1,resultado_pais2,estado_pais1) " + 
					 " VALUES ("+pronostico.getIdPartido()+", "+pronostico.getResultadoPais1()+", "
				+pronostico.getResultadoPais2()+", "+pronostico.getEstadoPais()+")";
		stmt.executeUpdate(sql);
		return null;
	}

	@Override
	public List<Pais> listarPaises()  throws Exception{
		Connection conn = null;
		Statement stmt = null;
		List<Pais> lPais = null;
		   
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		stmt = conn.createStatement();
		String sql;
		sql = "select id_pais,nombre,ruta_imagen_web from pais";
		final ResultSet rs = stmt.executeQuery(sql);
		lPais = new ArrayList<Pais>();
		while (rs.next()) {
			Pais pais = new Pais();
			pais.setIdPais(rs.getInt("id_pais"));
			pais.setNombre(rs.getString("nombre"));
			pais.setRuta(rs.getString("ruta_imagen_web"));
			lPais.add(pais);
		}
		rs.close();
		stmt.close();
		conn.close();
		return lPais;
	}

	@Override
	public Pronostico getPronostico(Pais pais) throws Exception {
		String sqllll = " select pais.id_pais,pais.nombre,pais.ruta_imagen_web "+
		" ,sum(pro.estado_pais1=0) 'empate',sum(pro.estado_pais1=1) 'perdio',sum(pro.estado_pais1=2) 'gano'  "+ 
		" from pronostico pro inner join partido par  "+
		" on par.id_partido=pro.id_partido "+
		" inner join pais pais "+
		" on pais.id_pais=par.id_pais1 "+
		" where id_pais1= "+pais.getIdPais()+"; ";


		Connection conn = null;
		Statement stmt = null;
		Pronostico pronostico = null;
		   
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		stmt = conn.createStatement(); 
		final ResultSet rs = stmt.executeQuery(sqllll);
		pronostico = new Pronostico();
		while (rs.next()) {
			Partido partido = new Partido();
			Pais pais1 = new Pais();
			pais1.setIdPais(rs.getInt("id_pais"));
			pais1.setNombre(rs.getString("nombre"));
			pais1.setRuta(rs.getString("ruta_imagen_web"));
			partido.setPais1(pais1);
			pronostico.setPartido(partido);
			
			pronostico.setEstadoEmpate(rs.getInt("empate"));
			pronostico.setEstadoPerdio(rs.getInt("perdio"));
			pronostico.setEstadoGano(rs.getInt("gano"));
			break;
		}
		rs.close();
		stmt.close();
		conn.close();
		return pronostico;
		
	}

}
