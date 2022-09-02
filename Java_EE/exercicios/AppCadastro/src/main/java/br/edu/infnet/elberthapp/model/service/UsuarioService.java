package br.edu.infnet.elberthapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.elberthapp.model.domain.Usuario;
import br.edu.infnet.elberthapp.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public Usuario validar(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
}