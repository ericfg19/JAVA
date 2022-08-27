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

		<form action="/aluno/incluir" method="post">
		
			<div class="form-group">
				<label>Nome:</label>		
				<input type="text" value="Aluno Teste" name="nome" class="form-control">
			</div>

			<div class="form-group">			
				<label>Email:</label>			
				<input type="email" value="testealuno@teste.com" name="email" class="form-control">
			</div>

			<div class="form-group">				
				<label>Curso:</label>				
				<input type="radio" name="curso" value="G"> Graduação
				<input type="radio" name="curso" value="E"> Especialização
				<input type="radio" checked name="curso" value="M"> Mestrado
				<input type="radio" name="curso" value="D"> Doutorado
			</div>

			<div class="form-group">			
				<label>Disciplinas:</label>
				<div class="checkbox">
					<label><input type="checkbox" name="disciplinas" value="Fundamentos"> Fundamentos do Desenvolvimento Java</label>
				</div>
				<div class="checkbox">
					<label><input type="checkbox" checked name="disciplinas" value="Desenvolvimento"> Desenvolvimento Java Web</label>
				</div>
				<div class="checkbox">
					<label><input type="checkbox" checked name="disciplinas" value="POO"> Programação Orientada a Objetos</label>
				</div>
				<div class="checkbox">
					<label><input type="checkbox" name="disciplinas" value="Cloud"> Projeto de Bloco Java Cloud</label>
				</div>
			</div>

			<div class="form-group">
				<label>Região</label>			
				<select name="regiao" class="form-control">
					<option>Norte</option>
					<option selected>Sul</option>
					<option>Sudeste</option>
					<option>Nordeste</option>
		 			<option>Centro-Oeste</option>
				</select>
			</div>

			<button type="submit" class="btn btn-gray">Cadastrar</button>
		</form>
	</div>
</body>
</html>