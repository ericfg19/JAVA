package br.edu.infnet.ericapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.ericapp.model.domain.Aluno;

@Controller
public class AlunoController {
	
	private String mensagem;
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	
	@GetMapping(value = "/aluno")
	public String telaCadastro() {
		return "aluno/cadastro";
	}
	
	@GetMapping(value = "/aluno/lista")
	public String telaLista(Model model) {
		
		
		model.addAttribute("listagem", alunos);
		model.addAttribute("msg", mensagem);
		
		return "aluno/lista";
	}
	
	@PostMapping(value = "/aluno/incluir")
	public String incluir(Aluno aluno) {
		
		alunos.add(aluno);
		
		mensagem = "A inclusão do aluno "+aluno.getNome()+" ("+aluno.getEmail()+") foi realizada com sucesso!";
		
		//model.addAttribute("msg", mensagem);
		
		return "redirect:/aluno/lista";
	}
}
