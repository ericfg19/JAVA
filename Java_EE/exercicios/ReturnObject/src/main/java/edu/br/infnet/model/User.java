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
	private String telefone;
	
	
	public User(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	
}
