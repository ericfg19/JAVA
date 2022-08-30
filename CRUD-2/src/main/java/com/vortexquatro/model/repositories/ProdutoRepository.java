package com.vortexquatro.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.vortexquatro.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
