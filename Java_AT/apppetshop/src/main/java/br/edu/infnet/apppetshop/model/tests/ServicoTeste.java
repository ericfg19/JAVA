package br.edu.infnet.apppetshop.model.tests;

import br.edu.infnet.apppetshop.model.domain.Exame;
import br.edu.infnet.apppetshop.model.domain.Higiene;
import br.edu.infnet.apppetshop.model.domain.Hospedagem;
import br.edu.infnet.apppetshop.model.exceptions.ValorInvalidoException;

public class ServicoTeste {
	
	public static void main(String[] args) throws ValorInvalidoException {
		
		try {
		Exame exame = new Exame("Checkup", 49.50f, 123);
		exame.setConsulta(1);
		exame.setVacina(true);
		exame.setInformacao("Precisará realizar hemograma");
		System.out.println("Informações do Exame: " + exame);
		} catch (ValorInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
		Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199, 456);
		hospedagem.setDiaria(2);
		hospedagem.setGrande(false);
		hospedagem.setCuidados("Animal não possui uma pata");
		System.out.println("Informações de Hospedagem: " +hospedagem);
		} catch (ValorInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
		Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
		higiene.setQuantidade(1);
		higiene.setUnhas(true);
		higiene.setDetalhes("Ter cuidado ao limpar a orelha");
		System.out.println("Informações de Higiene: " +higiene);
		} catch (ValorInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}

}
