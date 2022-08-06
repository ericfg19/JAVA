package br.edu.infnet.ericapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.ericapp.model.domain.Aluno;

@Controller
public class AlunoController {
	
	@GetMapping(value = "/aluno")
	public String telaCadastro() {
		return "aluno/cadastro";
	}
	
	@PostMapping(value = "/aluno/incluir")
	public String incluir(Aluno aluno) {
		System.out.println("A inclusão do aluno "+aluno.getNome()+" ("+aluno.getEmail()+") foi realizada com sucesso! - post");
		
		return "redirect:/";
	}
}
