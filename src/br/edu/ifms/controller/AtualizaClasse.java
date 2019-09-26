package br.edu.ifms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifms.banco.BancoDeDados;
import br.edu.ifms.model.Classe;


@WebServlet("/atualizaClasse")
public class AtualizaClasse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		
		Classe classe = new Classe();
		
		BancoDeDados persistencia = new BancoDeDados();
		
		classe = persistencia.buscar(codigo);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("formulario.jsp");
		request.setAttribute("classe", classe);
		rd.forward(request, response);
		
	}

}
