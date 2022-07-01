package br.edu.infnet.apppetshop.model.domain;

import br.edu.infnet.apppetshop.model.exceptions.HigieneInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.ValorInvalidoException;

public class Higiene extends Servico {
	




	private int quantidade;
	private boolean unhas;
	private String detalhes;
	
	public Higiene(String nome, float valor, int codigo) throws ValorInvalidoException {
		super(nome, valor, codigo);
	}
	
	
	@Override
	public float calcularServico() throws HigieneInvalidoException {
		
		if(quantidade < 0) {
			throw new HigieneInvalidoException("Não é possível solicitar o atendimento "+getNome()+" pois a quantidade não pode ser negativa.");
		} else if(quantidade == 0) {
			throw new HigieneInvalidoException("Não é possível solicitar o atendimento "+getNome()+" pois a quantidade não pode ser zero.");
		}

		return getValor() * quantidade + (unhas ? 25f : 0);
	}
	
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(quantidade);
		sb.append(";");
		sb.append(unhas ? "sim" : "nao");
		sb.append(";");
		sb.append(detalhes);
		
		
		return sb.toString();
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isUnhas() {
		return unhas;
	}
	public void setUnhas(boolean unhas) {
		this.unhas = unhas;
	}
	
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}


}
