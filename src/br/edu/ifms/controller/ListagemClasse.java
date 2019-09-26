package br.edu.ifms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifms.banco.BancoDeDados;
import br.edu.ifms.model.Classe;


@WebServlet("/listagem")
public class ListagemClasse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BancoDeDados persistencia = new BancoDeDados();
		
		List<Classe> listaClasse = persistencia.getListaClasse();
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("/listaClasse.jsp");
		request.setAttribute("listaClasse", listaClasse);
		rd.forward(request, response);
		
	}

}
