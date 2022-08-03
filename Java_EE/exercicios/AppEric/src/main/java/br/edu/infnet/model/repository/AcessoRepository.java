package br.edu.infnet.model.repository;

import br.edu.infnet.model.domain.Aluno;

public class AcessoRepository {
		
	
	public static Aluno validar(String email, String senha) {
		
		if(email.equalsIgnoreCase(senha)) {
			return new Aluno("Admin", email);
		} else {
			
			return null;
		}
		
	}
}
