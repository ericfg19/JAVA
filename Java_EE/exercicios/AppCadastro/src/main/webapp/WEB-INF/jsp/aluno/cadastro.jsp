<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
<title>App - Lista</title>
</head>
<body>
	<div class="container">

<!-- Receba o nome e o e-mail do aluno: use caixas de texto -->

		<form action="/aluno/incluir" method="post">
		
			<div class="form-group">
			
			<label>Nome:</label>
			
			<input type="text" value="Aluno Teste" name="nome" class="form-control">
			</div>
			<hr>
			<div class="form-group">
			
			<label>Email:</label>
			
			<input type="email" value="testealuno@teste.com" name="email" class="form-control">
			</div>
			<hr>
			
	<!-- Selecione o curso que o aluno vai fazer: graduação, especialização, 
	mestrado ou doutorado: use um radiobutton -->
	
			<div class="form-group">
			
			<label>Curso:</label>
			
			<input type="radio" name="curso" value="G"> Graduação
			<input type="radio" name="curso" value="E"> Especialização
			<input type="radio" checked name="curso" value="M"> Mestrado
			<input type="radio" name="curso" value="D"> Doutorado
			</div>
			<hr>
	<!-- Indique as disciplinas que o aluno vai cursar: use checkboxes -->
			
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
			<hr>
			
	<!-- Selecione a região do Brasil que o aluno mora: use um select (combobox) -->
			
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