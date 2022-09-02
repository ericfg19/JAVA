package com.vortexquatro.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.vortexquatro.model.entities.Produto;
import com.vortexquatro.model.repositories.ProdutoRepository;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
//	@RequestMapping(method = RequestMethod.POST)
//	public @ResponseBody Produto novoProduto(	@RequestParam String nome, 
//												@RequestParam double preco, 
//												@RequestParam double desconto) {
	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Produto novoProduto(@Valid Produto produto){ 	
		produtoRepository.save(produto);
		return produto;
		
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {	
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/pagina/{numeroPagina}/{tamPagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina,
													@PathVariable int tamPagina) {
		
		if (tamPagina >= 5)
			tamPagina = 5;
			
		Pageable page = PageRequest.of(numeroPagina, tamPagina);
		return produtoRepository.findAll(page);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/{id}" )
	public Optional<Produto> obterProdutoId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Produto alteraProduto(@Valid Produto produto) {
		
		produtoRepository.save(produto);
		return produto;
	}	
	
	@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
		System.out.println("deletado");
	}

}
