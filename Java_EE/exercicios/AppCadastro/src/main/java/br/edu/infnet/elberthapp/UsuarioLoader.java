package br.edu.infnet.elberthapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired 
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		
		
		usuario.setAdmin(true);
		usuario.setEmail("elberth@elberth.com");
		usuario.setNome("Elberth L C Moraes");
		usuario.setSenha("123");
		
		usuarioService.incluir(usuario);
	}
}