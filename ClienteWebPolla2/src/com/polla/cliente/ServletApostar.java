package com.polla.cliente;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.polla.service.Pais;
import com.polla.service.PronosticoServiceImpl;
import com.polla.service.PronosticoServiceImplProxy;

/**
 * Servlet implementation class ServletApostar
 */
@WebServlet("/apostar")
public class ServletApostar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletApostar() {
        super();
        // TODO Auto-generated constructor stub
    }
    PronosticoServiceImpl pronostico = new PronosticoServiceImplProxy();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println("IdPartido:"+id);
		String scort1 = request.getParameter("scort1");
		String scort2 = request.getParameter("scort2");
		Integer resultadoPais1 = Integer.parseInt(scort1);
		Integer resultadoPais2 = Integer.parseInt(scort2);
		Integer idPartido = Integer.parseInt(id);
		pronostico.registrarPronostico(idPartido, resultadoPais1, resultadoPais2);
		
		Pais[] paises = pronostico.listarPaises();
		request.setAttribute("paises", paises);
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
