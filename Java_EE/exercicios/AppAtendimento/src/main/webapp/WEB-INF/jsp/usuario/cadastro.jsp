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
	
		<form action="/cep" class="form-inline" method="post">
			<div class="form-group">
				<label>Cep:</label>		
				<input type="text" value="" name="cep" class="form-control">
			</div>
		
			<button type="submit" class="btn btn-primary">Buscar</button>
		</form>
		
		<hr>
	
		<form action="/usuario/incluir" method="post">
		
			<div class="form-group">
				<label>Nome:</label>		
				<input type="text" value="Joaozinho Dev" name="nome" class="form-control">
			</div>

			<div class="form-group">			
				<label>E-mail:</label>			
				<input type="email" value="joaozinho@dev.com" name="email" class="form-control">
			</div>

			<div class="form-group">
				<label>Senha:</label>		
				<input type="password" value="123" name="senha" class="form-control">
			</div>
			
			<c:import url="/WEB-INF/jsp/endereco.jsp"/>

			<button type="submit" class="btn btn-gray">Cadastrar</button>
		</form>
	</div>
</body>
</html>