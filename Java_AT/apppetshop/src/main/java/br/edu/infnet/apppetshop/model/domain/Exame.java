package br.edu.infnet.apppetshop.model.domain;

import br.edu.infnet.apppetshop.model.exceptions.ExameInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.ValorInvalidoException;

public class Exame extends Servico {
	
	private int consulta;
	private boolean vacina;
	private String informacao;
	

	public Exame(String nome, float valor, int codigo) throws ValorInvalidoException {
		super(nome, valor, codigo);
		
	}



	@Override
	public float calcularServico() throws ExameInvalidoException {
		if(consulta < 0) {
			throw new ExameInvalidoException("Não é possível solicitar o exame pois o número consultas de "+getNome()+" está negativo.");
		} else if(consulta == 0) {
			throw new ExameInvalidoException("Não é possível solicitar o exame pois o número consultas de "+getNome()+" está zero.");
		}

		
		
		return getValor() * consulta + (vacina ? 70f : 0);
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(consulta);
		sb.append(";");
		sb.append(vacina ? "sim" : "nao");
		sb.append(";");
		sb.append(informacao);
		
		
		return sb.toString();
}
	

	public int getConsulta() {
		return consulta;
	}
	public void setConsulta(int consulta) {
		this.consulta = consulta;
	}
	
	public boolean isVacina() {
		return vacina;
	}
	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public String getInformacao() {
		return informacao;
	}
	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

	
}
