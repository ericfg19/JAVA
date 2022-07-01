package br.edu.infnet.apppetshop.model.domain;

import br.edu.infnet.apppetshop.model.exceptions.ClienteInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.HigieneInvalidoException;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	private String nomepet;

	public Cliente(String nome, String cpf, String email, String nomepet) throws ClienteInvalidoException {
		
		if(nome == null) {
			throw new ClienteInvalidoException("Não é possível cadastrar um cliente sem NOME.");
		} else if(cpf == null) {
			throw new ClienteInvalidoException("Não é possível cadastrar um cliente sem CPF.");
		} else if(email == null) {
			throw new ClienteInvalidoException("Não é possível cadastrar um cliente sem EMAIL.");
		}
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.nomepet = nomepet;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		sb.append(nomepet);

		return sb.toString();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomepet() {
		return nomepet;
	}

	public void setNomepet(String nomepet) {
		this.nomepet = nomepet;
	}
	
}
