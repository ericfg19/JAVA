package br.edu.infnet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Aluno;
import br.edu.infnet.model.repository.AcessoRepository;


public class AcessoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AcessoController() {
        
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		// se as informações forem iguais, o usuário irá logar no sistema
		Aluno aluno = AcessoRepository.validar(email, senha);
		
		if(aluno != null) {
			request.getRequestDispatcher("aluno/cadastro.html").forward(request, response);
		} else {
			request.getRequestDispatcher("login.html").forward(request, response);
		}
		
		
	}

}
