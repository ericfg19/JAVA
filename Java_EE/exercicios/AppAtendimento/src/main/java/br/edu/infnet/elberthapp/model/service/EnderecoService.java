package br.edu.infnet.elberthapp.model.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.elberthapp.model.domain.Endereco;

@Service
public class EnderecoService {

	public Endereco buscarCep(String cep){
		Endereco e = new Endereco();
		e.setBairro("bairro"+cep);
		e.setCep(cep);
		e.setComplemento("complemento"+cep);
		e.setLocalidade("localidade"+cep);
		e.setLogradouro("logradouro"+cep);
		e.setUf("uf"+cep);
		
		return e;
	}
}