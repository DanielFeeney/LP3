<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.edu.ifms.model.Classe" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Classes - JSP</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Codigo</td>
			<td>Título</td>
			<td>Descrição</td>
			<td>Usuário de Magia</td>
			<td>Dinheiro Inicial</td>
			<td>Raça com Vantagem</td>
			<td>Modificador</td>
			<td>Última Atualização</td>
			<td>Data de Cadastro</td>
			<td>Observação</td>
			<td colspan="2">Ações</td>
			
		</tr>
		<c:forEach items="${listaClasse}" var="classe">
		<tr> 
		<td>${classe.codigo}</td>
		<td>${classe.titulo}</td>
		<td>${classe.descricao}</td>
		<td>${classe.magia ? 'VERDADEIRO' : 'FALSO'}</td>
		<td>
		<fmt:formatNumber type="currency" value="${classe.dinheiroInicial}"/>
		</td>
		<td>${classe.racaComVantagem == "E".charAt(0) ? 'Elfo' : ''}
			${classe.racaComVantagem == "H".charAt(0) ? 'Humano' : ''}
			${classe.racaComVantagem == "M".charAt(0) ? 'Meio-elfo' : ''}
			${classe.racaComVantagem == "O".charAt(0) ? 'Orc' : ''} </td>
		<td>${classe.modificador}</td>
		<td>
		<fmt:formatDate value="${classe.dataAtualizacao}" pattern="dd/MM/yyyy HH:mm:ss"/>
		</td>
		<td>
		<fmt:formatDate value="${classe.dataCadastro}" pattern="dd/MM/yyyy HH:mm:ss"/>
		</td>
		<td>${classe.observacao}</td>
		<td>
		<a href="/lp3-daniel/atualizaClasse?codigo=${classe.codigo}">
		editar
		</a>
		</td>		
		
		<td>
		<a href="/lp3-daniel/removeClasse?codigo=${classe.codigo}">
		remover
		</a>
		</td>		
		</tr>		
		</c:forEach>
		
	</table>
	
	<a href="/lp3-daniel/formulario.jsp">Novo</a>

</body>
</html>