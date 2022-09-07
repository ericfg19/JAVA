<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.Arrays"%>
<%@page import="br.edu.infnet.elberthapp.model.domain.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>App - Cadastro</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
		<h2>Cadastramento de Bebidas</h2>

		<c:if test="${not empty msg}">		
			<div class="alert alert-success">
				<strong>Successo!</strong> ${msg}
			</div>				
		</c:if>
		
		<form action="/bebida" method="get">
			<button type="submit" class="btn btn-gray">Novo</button>
		</form>

		<p>Listagem de bebidas cadastrados: ${listagem.size()}</p>
		            
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>ID</th>
		      <th>Nome</th>
		      <th>Valor</th>
		      <th>Código</th>
		      <th>Gelada</th>
		      <th>Tamanho</th>
		      <th>Marca</th>

		      <th></th>
		    </tr>
		  </thead>
		  
		  <tbody>
			<c:forEach var="b" items="${listagem}">
			   <tr>
			     <td>${b.id}</td>
			     <td>${b.nome}</td>
			     <td>${b.valor}</td>
			     <td>${b.codigo}</td>
			     <td>${b.gelada}</td>
			     <td>${b.tamanho}</td>
			     <td>${b.marca}</td>
			     <td><a href="/bebida/${b.id}/excluir">Excluir</a></td>
			   </tr>
			</c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>