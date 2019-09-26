<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="cadastrar" method="post">
	<p>Código</p>
	<input id="codigo" type="number" name="codigo" value="${classe.codigo}" readonly="true">
	<p>Título</p>
	<input id="titulo" name="titulo" value="${classe.titulo}">
	<p>Descrição</p>
	<input id="descricao" name="descricao" value="${classe.descricao}">
	<p>Observação</p>
	<textarea id="observacao" name="observacao" cols="50" rows="3">${classe.observacao}</textarea>
	<p>Dinheiro Inicial</p>
	<input id="dinheiro" type="number" step="0.1" value="${classe.dinheiroInicial}" name="dinheiro">
	<p>Usa magia?</p>
	<input type="radio" name="magia" ${classe.magia == true ? "checked" : ""}  value="true"> Sim<br>
  	<input type="radio" name="magia" ${classe.magia == true ? "" : "checked"} value="false"> Não<br>
	<p>Raça com vantagem</p>
	<select name="racaComVantagem" >
	  <option value="">Selecione</option>
	  <option ${classe.racaComVantagem == "E".charAt(0) ? "selected" : ""} value="E" >Elfo</option>
	  <option ${classe.racaComVantagem == "H".charAt(0) ? "selected" : ""} value="H">Humano</option>
	  <option ${classe.racaComVantagem == "M".charAt(0) ? "selected" : ""} value="M">Meio-Elfo</option>
	  <option ${classe.racaComVantagem == "O".charAt(0) ? "selected" : ""} value="O">Orc</option>
	</select>
	<p>Modificador de habilidade</p>
	<input id="modificador" name="modificador" type="number" value="${classe.modificador}">
	<input type="submit" value="Enviar">
</form>
<form action="listagem" method="get">
<input type="submit" value="Listagem">
</form>
</body>
</html>