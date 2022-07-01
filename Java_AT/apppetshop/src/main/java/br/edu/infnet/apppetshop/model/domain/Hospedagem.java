package br.edu.infnet.apppetshop.model.domain;

import br.edu.infnet.apppetshop.model.exceptions.HospedagemInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.ValorInvalidoException;

public class Hospedagem extends Servico {
	
	private int diaria;
	private boolean grande;
	private String cuidados;
	
	
	public Hospedagem(String nome, float valor, int codigo) throws ValorInvalidoException {
		super(nome, valor, codigo);
	}
	
	
	@Override
	public float calcularServico() throws HospedagemInvalidoException {

		if(diaria < 0) {
			throw new HospedagemInvalidoException("Não foi possível solicitar o serviço de hospedagem pois o número de diárias em "+getNome()+" inserido está negativo.");
		} else if(diaria == 0) {
			throw new HospedagemInvalidoException("Não foi possível solicitar o serviço de hospedagem pois o número de diárias em "+getNome()+" inserido está zero.");
		}
		
		return getValor() * diaria + (grande ? 220f : 0);
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(diaria);
		sb.append(";");
		sb.append(grande ? "sim" : "nao");
		sb.append(";");
		sb.append(cuidados);
		
		
		return sb.toString();
	}
	
	
	public int getDiaria() {
		return diaria;
	}
	public void setDiaria(int diaria) {
		this.diaria = diaria;
	}
	public boolean isGrande() {
		return grande;
	}
	public void setGrande(boolean grande) {
		this.grande = grande;
	}
	public String getCuidados() {
		return cuidados;
	}
	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}

}
