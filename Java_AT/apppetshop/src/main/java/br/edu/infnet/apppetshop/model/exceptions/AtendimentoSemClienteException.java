package br.edu.infnet.apppetshop.model.exceptions;

public class AtendimentoSemClienteException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public AtendimentoSemClienteException(String mensagem) {
		super(mensagem);
	}

}
