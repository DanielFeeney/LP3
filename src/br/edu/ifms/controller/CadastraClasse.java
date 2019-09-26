package br.edu.ifms.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifms.banco.BancoDeDados;
import br.edu.ifms.model.Classe;

/**
 * Servlet implementation class CadastraClasse
 */
@WebServlet("/cadastrar")
public class CadastraClasse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Classe classe = new Classe();
		if(request.getParameter("codigo") != null 
				&& !request.getParameter("codigo").trim().equals("")) {
			classe.setCodigo(Integer.parseInt(request.getParameter("codigo")));
		}		
		classe.setTitulo(request.getParameter("titulo"));
		classe.setDescricao(request.getParameter("descricao"));
		classe.setObservacao(request.getParameter("observacao"));
		classe.setDinheiroInicial(Double.parseDouble(request.getParameter("dinheiro")));
		classe.setMagia(Boolean.parseBoolean(request.getParameter("magia")));
		classe.setRacaComVantagem(request.getParameter("racaComVantagem").charAt(0));
		classe.setModificador(Integer.parseInt(request.getParameter("modificador")));
		
		BancoDeDados persistencia = new BancoDeDados();
		
		
		if(classe.getCodigo() == null) {
			persistencia.adicionar(classe);
		}
		else {
			persistencia.atualizar(classe);
		}
		
		List<Classe> listaClasse = persistencia.getListaClasse();
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaClasse.jsp");
		
		//passar o atributo da lista
		request.setAttribute("listaClasse", listaClasse);
		
		//vaiiiiiiiiiiiiiiiii
		rd.forward(request, response);
		
	}

}
