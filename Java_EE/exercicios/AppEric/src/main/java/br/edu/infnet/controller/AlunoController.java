package br.edu.infnet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Aluno;


public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<Aluno> alunos;

   
    public AlunoController() {
        
    	alunos = new ArrayList<Aluno>();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("aluno/cadastro.html").forward(request, response);
		System.out.println("---log: passei pelo get");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
		
		aluno.setIdade(Integer.valueOf(request.getParameter("idade")));;
		aluno.setMensalidade(Integer.valueOf(request.getParameter("mensalidade")));;
		aluno.setCurso(request.getParameter("curso"));;
		aluno.setDisciplinas(request.getParameterValues("disciplinas")); 
		aluno.setRegiao(request.getParameter("regiao"));
		
		alunos.add(aluno);
		
		PrintWriter out =  response.getWriter();
		
		
		out.println(aluno);
		out.println("<h2>Aluno Cadastrado = "+alunos.size()+"</h2>");
		
		for (Aluno a : alunos) {
			out.println("<h3>"+a.getNome()+" - "+a.getEmail()+" - "+a.getIdade()+"</h3>");
			
		}
		
		
		out.println("<a href='aluno'>Voltar</a>");
		
		//request.getRequestDispatcher("aluno/confirmacao.html").forward(request, response);
		
		//System.out.println("---log: passei pelo post");
		
		// todo criar metodo de impressao chamar tostring e foreach
		
		/*if(qtde > 0) {
			System.out.println("Disciplinas:");
			for (String disciplina : disciplinas) {
				System.out.println("-" + disciplina);
			}
		} else {
			System.out.println("Não existem disciplinas selecionadas");
		}*/
		
		
	}

}
