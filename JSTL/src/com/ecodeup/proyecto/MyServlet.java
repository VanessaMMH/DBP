package com.ecodeup.proyecto;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		// TODO Auto-generated method stub
		System.out.println("ingreo get");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		/*
		// TODO Auto-generated method stub
		System.out.println("ingreo post");
		System.out.println(request.getParameter("nombre"));
		request.setAttribute("name1", request.getParameter("nombre"));

		RequestDispatcher rd;
		rd=request.getRequestDispatcher("/presentacion.jsp");
		
		rd.forward(request, response);
		*/
		
		int estudianteId = Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("nombre");
	

		EstudianteBean estudiante = new EstudianteBean(name,estudianteId);

		HttpSession session = request.getSession();
		session.setAttribute("estudiante",estudiante);

		String url ="/presentacion.jsp";

		RequestDispatcher rd;
				rd=request.getRequestDispatcher(url);
		rd.forward(request, response);
		
		

		doGet(request, response);
	}

}
