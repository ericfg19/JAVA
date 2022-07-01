package br.edu.infnet.apppetshop.model.tests;

import br.edu.infnet.apppetshop.model.domain.Higiene;
import br.edu.infnet.apppetshop.model.exceptions.HigieneInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.ValorInvalidoException;

public class HigieneTeste {

	public static void main(String[] args) {
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(1);
			higiene.setUnhas(false);
			higiene.setDetalhes("Ter cuidado ao limpar a orelha");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(1);
			higiene.setUnhas(true);
			higiene.setDetalhes("Ter cuidado ao limpar a orelha");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(2);
			higiene.setUnhas(false);
			higiene.setDetalhes("Ter cuidado ao limpar a orelha");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(2);
			higiene.setUnhas(true);
			higiene.setDetalhes("Ter cuidado ao limpar a orelha");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(1);
			higiene.setUnhas(false);
			higiene.setDetalhes("Banho e tosa completo + corte de unhas");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(2);
			higiene.setUnhas(false);
			higiene.setDetalhes("Banho e tosa completo + corte de unhas");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(1);
			higiene.setUnhas(true);
			higiene.setDetalhes("Banho e tosa completo + corte de unhas");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(2);
			higiene.setUnhas(false);
			higiene.setDetalhes("Banho e tosa completo + corte de unhas");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(2);
			higiene.setUnhas(true);
			higiene.setDetalhes("Banho e tosa completo + corte de unhas");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(0);
			higiene.setUnhas(false);
			higiene.setDetalhes("Banho e tosa completo + corte de unhas");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
			higiene.setQuantidade(-1);
			higiene.setUnhas(false);
			higiene.setDetalhes("Banho e tosa completo + corte de unhas");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 0, 789);
			higiene.setQuantidade(1);
			higiene.setUnhas(false);
			higiene.setDetalhes("Banho precisa ser com água quente");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", -1, 789);
			higiene.setQuantidade(1);
			higiene.setUnhas(false);
			higiene.setDetalhes("Banho precisa ser com água quente");
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HigieneInvalidoException e) {
				System.out.println("[ERRO HIGIENE] " + e.getMessage());
			}
		
	}
}
