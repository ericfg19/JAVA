package br.edu.infnet.apppetshop.model.tests;

import br.edu.infnet.apppetshop.model.domain.Exame;
import br.edu.infnet.apppetshop.model.exceptions.ExameInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.ValorInvalidoException;

public class ExameTeste {

		public static void main(String[] args) {
			
		try {
			Exame exame = new Exame("Checkup", 49.50f, 123);
			exame.setConsulta(1);
			exame.setVacina(false);
			exame.setInformacao("Exame periódico");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Checkup", 49.50f, 123);
			exame.setConsulta(1);
			exame.setVacina(true);
			exame.setInformacao("Exame periódico + aplicação de vacina");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Checkup", 49.50f, 123);
			exame.setConsulta(2);
			exame.setVacina(false);
			exame.setInformacao("Exame periódico");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Aplicar Vacinas", 49.50f, 123);
			exame.setConsulta(2);
			exame.setVacina(true);
			exame.setInformacao("Recebeu vacina V4");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Checkup", 0, 123);
			exame.setConsulta(2);
			exame.setVacina(true);
			exame.setInformacao("Recebeu vacina V4");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Checkup", -1, 123);
			exame.setConsulta(2);
			exame.setVacina(true);
			exame.setInformacao("Recebeu vacina V4");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Hemograma", 0, 123);
			exame.setConsulta(1);
			exame.setVacina(true);
			exame.setInformacao("Precisará realizar outro exame de prevenção");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Hemograma", 69.50f, 123);
			exame.setConsulta(1);
			exame.setVacina(true);
			exame.setInformacao("Precisará realizar outro exame de prevenção");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Hemograma", 69.50f, 123);
			exame.setConsulta(1);
			exame.setVacina(false);
			exame.setInformacao("Precisará realizar outro exame de prevenção");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Hemograma", 69.50f, 123);
			exame.setConsulta(0);
			exame.setVacina(true);
			exame.setInformacao("Precisará realizar outro exame de prevenção");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Hemograma", 69.50f, 123);
			exame.setConsulta(1);
			exame.setVacina(true);
			exame.setInformacao("Precisará realizar outro exame de prevenção");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Eletrocardiograma", -1, 123);
			exame.setConsulta(1);
			exame.setVacina(true);
			exame.setInformacao("Precisará realizar outro exame de prevenção");
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
	}

}