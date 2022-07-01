package br.edu.infnet.apppetshop.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.apppetshop.model.exceptions.AtendimentoSemClienteException;
import br.edu.infnet.apppetshop.model.exceptions.AtendimentoSemServicoException;
import br.edu.infnet.apppetshop.model.exceptions.ClienteInvalidoException;

public class Atendimento {
	
	
	private Cliente cliente;
	private LocalDateTime data;
	private String descricao;
	private boolean web;
	private List<Servico> servico;

	
	public Atendimento(Cliente cliente) throws AtendimentoSemClienteException {
		
		if(cliente == null) {
			throw new AtendimentoSemClienteException("Não existe um cliente associado ao atendimento.");
		}
		
		descricao = "Primeiro Atendimento";
		data = LocalDateTime.now();
		web = true;
		
		this.cliente = cliente;
	}
	
	public void impressao() throws AtendimentoSemServicoException {
		
		if(servico == null) {
			throw new AtendimentoSemServicoException("Não existe um serviço associado ao atendimento.");
		}
		
		System.out.println(this);
		
		for(Servico servico : servico) {
			System.out.println(servico);
		}
	}
	
	public String toString() {
		
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			
			StringBuilder sb = new StringBuilder();
			sb.append(descricao);
			sb.append(";");
			sb.append(data.format(formato));
			sb.append(";");
			sb.append(web ? "web" : "loja");
			sb.append(";");
			sb.append(cliente.toString());
			sb.append(";");
			sb.append(servico != null ? servico.size() : 0);
			
		
			sb.append(";");

			
			
			return sb.toString();
	}
	
	


	public LocalDateTime getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	
	public List<Servico> getServico() {
		return servico;
	}
	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public String obterDadosArquivo() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this);
		sb.append("\r\n");

		return sb.toString();
	}



}

