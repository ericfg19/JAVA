<%@page import="java.util.Arrays"%>
<%@page import="br.edu.infnet.ericapp.model.domain.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
<title>App - Lista</title>
</head>
<body>
	<%
	List<Aluno> lista = (List<Aluno>)request.getAttribute("listagem");
	%>
	<div class="container">
		
		  <h2>Cadastramentos de Alunos</h2>
		  		<div class="alert alert-success">
				  <strong>Sucesso!</strong> ${msg}
				</div>
		  
			  
			<form action="/aluno" method="get">
				<button type="submit" class="btn btn-gray">Novo</button>
			</form>
			
			  <p>Listagem de Alunos Cadastrados:  ${listagem.size()}</p>        
			  <table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Nome</th>
			        <th>Email</th>
			        <th>Curso</th>
			        <th>Discuplinas</th>
			        <th>Região</th>
			      </tr>
			    </thead>
			    <tbody>
			    <!-- estrutura de repetição -->
			    <%for(Aluno a : lista){%>
			      <tr>
			        <td><%=a.getNome() %></td>
			        <td><%=a.getEmail() %></td>
			        <td><%=a.getCurso() %></td>
			        <td><%=Arrays.asList(a.getDisciplinas()) %></td>
			        <td><%=a.getRegiao() %></td>
			      </tr>
			      <%}%>
			    </tbody>
			  </table>
		
	

	</div>
</body>
</html>