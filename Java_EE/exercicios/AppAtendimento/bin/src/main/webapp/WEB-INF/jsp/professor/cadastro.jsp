<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
<title>App - Cadastro</title>
</head>
<body>
	<div class="container">

<!-- Receba o nome e o e-mail do aluno: use caixas de texto -->

		<form action="/professor/incluir" method="post">
		
			<div class="form-group">
			
			<label>Nome:</label>
			
			<input type="text" value="Prof Teste" name="nome" class="form-control">
			</div>
			<hr>
			<div class="form-group">
			
			<label>Email:</label>
			
			<input type="email" value="testeprof@teste.com" name="email" class="form-control">
			</div>
			<hr>
			
			<div class="form-group">
			
			<label>CPF:</label>
			
			<input type="text" value="121.555.911.99" name="cpf" class="form-control">
			</div>
			<hr>
			
	<!-- Coloque um botão chamado "Cadastrar": use um button -->
			
			<h3>
			Cadastrar
			</h3>
			
			<button type="submit" class="btn btn-gray">Cadastrar</button>
		</form>
	</div>
</body>
</html>