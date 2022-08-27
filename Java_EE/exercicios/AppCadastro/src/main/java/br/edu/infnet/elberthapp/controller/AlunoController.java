package br.edu.infnet.elberthapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.elberthapp.model.domain.Aluno;
import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.AlunoService;

@Controller
public class AlunoController {
	
	private String mensagem;
	
	@Autowired 
	private AlunoService alunoService;
	
	@GetMapping(value = "/aluno/listar")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("msg", mensagem);
		
		model.addAttribute("listagem", alunoService.obterLista(usuario));
		
		return "aluno/lista";
	}

	@GetMapping(value = "/aluno")
	public String telaCadastro() {
		return "aluno/cadastro";
	}
	
	@PostMapping(value = "/aluno/incluir")
	public String incluir(Aluno aluno, @SessionAttribute("user") Usuario usuario) {
		
		aluno.setUsuario(usuario);
		
		alunoService.incluir(aluno);
		
		mensagem = "A inclusão do aluno "+aluno.getNome()+" ("+aluno.getEmail()+") foi realizada com sucesso!";

		return "redirect:/aluno/listar";
	}
	
	@GetMapping(value = "/aluno/{id}/excluir")
	public String excluir(@PathVariable Integer id){
		
		alunoService.excluir(id);
		
		mensagem = "A exclusão do aluno ("+id+") foi realizada com sucesso!";

		return "redirect:/aluno/listar";
	}
}
