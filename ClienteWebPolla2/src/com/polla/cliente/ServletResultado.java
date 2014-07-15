package com.polla.cliente;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.polla.service.Pronostico;
import com.polla.service.PronosticoServiceImpl;
import com.polla.service.PronosticoServiceImplProxy;

/**
 * Servlet implementation class ServletResultado
 */
@WebServlet("/resultado")
public class ServletResultado extends HttpServlet {
//	PronosticoServiceImpl pronostico = new PronosticoServiceImplProxy();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletResultado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		cboPais
		String cboPais = request.getParameter("cboPais");
		Integer idPais = Integer.parseInt(cboPais);
		PronosticoServiceImpl pronosticosss = new PronosticoServiceImplProxy();
		Pronostico pronostico = pronosticosss.getPronostico(idPais);
		
		request.setAttribute("pronostico", pronostico);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/resultado.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
