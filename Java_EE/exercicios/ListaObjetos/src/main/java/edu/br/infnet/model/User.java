package edu.br.infnet.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
	private int id;
	private String nome;
	private String cpf;
	
	public User(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
}
