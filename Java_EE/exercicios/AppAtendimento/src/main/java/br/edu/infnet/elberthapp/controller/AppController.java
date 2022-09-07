package br.edu.infnet.elberthapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	private String mensagem;

	@GetMapping(value = "/")
	public String telaHome() {		
		return "home";
	}

	@GetMapping(value = "/login")
	public String telaLogin(Model model) {
		model.addAttribute("msg", mensagem);

		return "login";
	}

	@PostMapping(value = "/login")
	public String validar(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.validar(email, senha);

		if(usuario != null) {
			
			model.addAttribute("user", usuario);
			
			return "redirect:/";
		}
		
		mensagem = "Credenciais incorretas para o e-mail "+email+"!!!";
		
		return "redirect:/login";
	}

	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {

		status.setComplete();
		
		session.removeAttribute("user");
				
		return "redirect:/";
	}
}