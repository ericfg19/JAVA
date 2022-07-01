package br.edu.infnet.apppetshop.model.domain;

import java.time.format.DateTimeFormatter;

import br.edu.infnet.apppetshop.model.exceptions.ExameInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.HigieneInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.HospedagemInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.ValorInvalidoException;

public abstract class Servico {

	private String nome;
	private float valor;
	private int codigo;
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Servico(String nome, float valor, int codigo) throws ValorInvalidoException {
		
		if(valor < 0) {
			throw new ValorInvalidoException("Não é possível cadastrar o pedido pois o serviço "+nome+" está com o valor negativo.");
		} else if(valor == 0) {
			throw new ValorInvalidoException("Não é possível cadastrar o pedido pois o serviço "+nome+" está com o valor zero.");
		}
		
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}

	public abstract float calcularServico() throws ValorInvalidoException, ExameInvalidoException, HospedagemInvalidoException, HigieneInvalidoException;
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(codigo);
		sb.append(";");
		

		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}

	public float getValor() {
		return valor;
	}

	public int getCodigo() {
		return codigo;
	}
	
	
	
}
