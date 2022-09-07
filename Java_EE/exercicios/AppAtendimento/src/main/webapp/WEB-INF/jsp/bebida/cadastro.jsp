<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

		<form action="/bebida/incluir" method="post">
		
			<div class="form-group">
				<label>Nome:</label>		
				<input type="text" value="Suco de laranja" name="nome" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Valor:</label>		
				<input type="text" value="10" name="valor" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Codigo:</label>		
				<input type="text" value="789" name="codigo" class="form-control">
			</div>
			
			<div class="form-group">				
				<label>Gelada:</label>				
				<input type="radio" name="gelada" value="true" checked> Sim
				<input type="radio" name="gelada" value="false"> Não
			</div>

			<div class="form-group">
				<label>Tamanho(ML):</label>		
				<input type="text" value="500" name="tamanho" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Marca:</label>		
				<input type="text" value="Da Frutta" name="marca" class="form-control">
			</div>

			<button type="submit" class="btn btn-gray">Cadastrar</button>
		</form>
	</div>
</body>
</html>