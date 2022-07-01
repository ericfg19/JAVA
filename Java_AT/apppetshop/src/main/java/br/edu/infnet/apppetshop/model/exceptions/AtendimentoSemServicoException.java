package br.edu.infnet.apppetshop.model.exceptions;

public class AtendimentoSemServicoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public AtendimentoSemServicoException(String mensagem) {
		super(mensagem);
	}

}
