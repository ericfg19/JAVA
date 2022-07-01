package br.edu.infnet.apppetshop.model.exceptions;

public class ClienteInvalidoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ClienteInvalidoException(String mensagem) {
		super(mensagem);
	}

}
