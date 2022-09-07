package br.edu.infnet.elberthapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.elberthapp.model.domain.Bebida;
import br.edu.infnet.elberthapp.model.repository.BebidaRepository;
import br.edu.infnet.elberthapp.model.service.BebidaService;

@Component
public class ProdutoLoader implements ApplicationRunner {
	
	@Autowired
	private BebidaService bebidaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String[] bebidas = {"Chopp", "Café", "Suco", "Água"};
		
		for (String b : bebidas) {
			
			Bebida bebida = new Bebida();
			bebida.setCodigo(999);
			bebida.setGelada(true);
			bebida.setMarca("Bebida " + b);
			bebida.setNome(b);
			bebida.setTamanho(500);
			bebida.setValor(10);
			
			
			bebidaService.incluir(bebida);
		}
		
		Bebida bebida = null;
		
		bebida = bebidaService.obterPorId(1);
		System.out.println("Inclusão da Primeira bebida: " + bebida.getNome());
		
		for (Bebida b : bebidaService.obterLista()) {
			System.out.printf("%d - %s \n", b.getId(), b.getNome());
		}
		
		bebidaService.excluir(2);
		
		for (Bebida b : bebidaService.obterLista()) {
			System.out.printf("%d - %s \n", b.getId(), b.getNome());
		}
		
		
		try {
			bebida = bebidaService.obterPorId(2);
			
			System.out.printf("Inclusão da Primeira bebida: " + bebida.getNome());
			
			
		} catch (NullPointerException e) {
			System.err.println("[ERRO] " + e.getMessage());
		}
		
		
		
	}

}
