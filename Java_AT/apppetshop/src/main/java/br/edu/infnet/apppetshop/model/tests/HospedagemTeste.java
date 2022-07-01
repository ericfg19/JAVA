package br.edu.infnet.apppetshop.model.tests;

import br.edu.infnet.apppetshop.model.domain.Hospedagem;
import br.edu.infnet.apppetshop.model.exceptions.HospedagemInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.ValorInvalidoException;

public class HospedagemTeste {
	
	public static void main(String[] args) {
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199f, 456);
			hospedagem.setDiaria(1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199f, 456);
			hospedagem.setDiaria(1);
			hospedagem.setGrande(true);
			hospedagem.setCuidados("Animal não possui uma pata");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199f, 456);
			hospedagem.setDiaria(2);
			hospedagem.setGrande(true);
			hospedagem.setCuidados("Animal não possui uma pata");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199f, 456);
			hospedagem.setDiaria(2);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 0, 456);
			hospedagem.setDiaria(2);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", -1, 456);
			hospedagem.setDiaria(2);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199f, 456);
			hospedagem.setDiaria(0);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199f, 456);
			hospedagem.setDiaria(-1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Guanabara", 199f, 456);
			hospedagem.setDiaria(1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal possui diabetes");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Guanabara", 199f, 456);
			hospedagem.setDiaria(1);
			hospedagem.setGrande(true);
			hospedagem.setCuidados("Animal possui diabetes");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Guanabara", 0, 456);
			hospedagem.setDiaria(2);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal possui diabetes");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Guanabara", 0, 456);
			hospedagem.setDiaria(1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal possui diabetes");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Guanabara", -1, 456);
			hospedagem.setDiaria(1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal possui diabetes");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Guanabara", 199, 456);
			hospedagem.setDiaria(0);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal possui diabetes");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Guanabara", 199f, 456);
			hospedagem.setDiaria(-1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal possui diabetes");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Catete", -1, 456);
			hospedagem.setDiaria(2);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal filhote");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Catete", 199f, 456);
			hospedagem.setDiaria(0);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal filhote");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Catete", 199f, 456);
			hospedagem.setDiaria(-1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal filhote");
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
	}

}
