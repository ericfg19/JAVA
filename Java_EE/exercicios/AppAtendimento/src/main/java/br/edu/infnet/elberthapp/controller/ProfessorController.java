package br.edu.infnet.elberthapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.elberthapp.model.domain.Professor;

@Controller
public class ProfessorController {
	
	@GetMapping(value = "/professor")
	public String telaCadastro() {
		return "professor/cadastro";
	}
	
	@PostMapping(value = "/professor/incluir")
	public String incluir(Professor professor) {
		System.out.println("A inclusão do professor "+ professor.getNome() +" ("+ professor.getCpf() +") foi realizada com sucesso! - post");
		
		return "redirect:/";
	}

}
