package br.edu.infnet.elberthapp.model.domain;

public class Professor {
	
	private String nome;
	private String cpf;
	private String email;
	
	public Professor(String nome, String email) {
		this.nome = nome;
		this.email = email;
		
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		
		
	
		return String.format(" O professor %s - CPF:[%s] - Email: %s \n",
				nome,
				cpf,
				email
				);
	}

}
