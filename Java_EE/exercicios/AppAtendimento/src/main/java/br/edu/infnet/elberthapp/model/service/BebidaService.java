package br.edu.infnet.elberthapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.elberthapp.model.domain.Bebida;
import br.edu.infnet.elberthapp.model.repository.BebidaRepository;

@Service
public class BebidaService {

	
	@Autowired
	private BebidaRepository bebidaRepository;
	
	public void incluir(Bebida bebida) {
		bebidaRepository.save(bebida);
	}
	
	public void excluir(Integer id) {
		bebidaRepository.deleteById(id);
	}
	
	public Bebida obterPorId(Integer id) {
		return bebidaRepository.findById(id).orElse(null);
	}
	
	
	public List<Bebida> obterLista() {
		return (List<Bebida>) bebidaRepository.findAll();
	}
}
