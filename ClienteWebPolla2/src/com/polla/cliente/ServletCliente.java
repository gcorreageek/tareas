package com.polla.cliente;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.polla.service.Partido;
import com.polla.service.PronosticoServiceImpl;
import com.polla.service.PronosticoServiceImplProxy;

/**
 * Servlet implementation class ServletCliente
 */
@WebServlet("/servletCliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fecha = request.getParameter("fecha");
//		Date date = Utiles.stringToDate(fecha);
		
		PronosticoServiceImpl pronostico = new PronosticoServiceImplProxy();
		Partido[] partidos = pronostico.consultaPartido(fecha);
		for (Partido p : partidos) {
			System.out.println("Partido:"+p.getIdPartido()+"\t"+p.getPais1().getNombre()+"|"+p.getPais1().getRuta()+"|"+p.getPais2().getNombre()+"|"+p.getPais2().getRuta());
		}
		request.setAttribute("partidos", partidos);
//		response.sendRedirect("");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
		
	}
	public static void main(String[] args) throws RemoteException {
//		Date fecha = Utiles.stringToDate("");
		
//		PronosticoServiceImpl pronostico = new PronosticoServiceImplProxy();
//		Partido[] partidos = pronostico.consultaPartido("2014-01-17 05:36:25");
//		for (Partido p : partidos) {
//			System.out.println("Partido:"+p.getIdPartido()+"\t"+p.getPais1().getNombre()+"|"+p.getPais1().getRuta()+"|"+p.getPais2().getNombre()+"|"+p.getPais2().getRuta());
//		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
