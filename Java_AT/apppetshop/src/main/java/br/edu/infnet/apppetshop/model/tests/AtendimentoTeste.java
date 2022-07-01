package br.edu.infnet.apppetshop.model.tests;

import java.util.List;
import java.util.ArrayList;

import br.edu.infnet.apppetshop.model.domain.Atendimento;
import br.edu.infnet.apppetshop.model.domain.Cliente;
import br.edu.infnet.apppetshop.model.domain.Exame;
import br.edu.infnet.apppetshop.model.domain.Higiene;
import br.edu.infnet.apppetshop.model.domain.Hospedagem;
import br.edu.infnet.apppetshop.model.domain.Servico;
import br.edu.infnet.apppetshop.model.exceptions.AtendimentoSemClienteException;
import br.edu.infnet.apppetshop.model.exceptions.AtendimentoSemServicoException;
import br.edu.infnet.apppetshop.model.exceptions.ClienteInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.ExameInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.HigieneInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.HospedagemInvalidoException;
import br.edu.infnet.apppetshop.model.exceptions.ValorInvalidoException;

public class AtendimentoTeste {
	
	public static void main(String[] args) {
		
		
		List<Servico> servico = new ArrayList<Servico>();
		
		//testes exame
		try {
		Exame exame = new Exame("Checkup", 49.50f, 123);
		exame.setConsulta(1);
		exame.setVacina(false);
		exame.setInformacao("Exame periódico");
		servico.add(exame);
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
			exame.setInformacao("Recebeu vacina V4");
			servico.add(exame);
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Checkup", 49.50f, 123);
			exame.setConsulta(2);
			exame.setVacina(false);
			exame.setInformacao("Precisará realizar hemograma");
			servico.add(exame);
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
		
		try {
			Exame exame = new Exame("Checkup", 49.50f, 123);
			exame.setConsulta(2);
			exame.setVacina(true);
			exame.setInformacao("Recebeu vacina V4");
			servico.add(exame);
			System.out.println("Informações do Exame: " + exame);
			System.out.println("Valor = " +exame.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (ExameInvalidoException e) {
				System.out.println("[ERRO EXAME] " + e.getMessage());
			}
			
		
		
		// testes hospedagem
		try {
		Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199.50f, 456);
		hospedagem.setDiaria(1);
		hospedagem.setGrande(false);
		hospedagem.setCuidados("Animal não possui uma pata");
		servico.add(hospedagem);
		System.out.println("Informações de Hospedagem: " +hospedagem);
		System.out.println("Valor = " +hospedagem.calcularServico());
			} catch (ValorInvalidoException e) {
				System.out.println("[ERRO VALOR] " + e.getMessage());
			} catch (HospedagemInvalidoException e) {
				System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
			}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199.50f, 456);
			hospedagem.setDiaria(1);
			hospedagem.setGrande(true);
			hospedagem.setCuidados("Animal não possui uma pata");
			servico.add(hospedagem);
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HospedagemInvalidoException e) {
					System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
				}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199.50f, 456);
			hospedagem.setDiaria(2);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			servico.add(hospedagem);
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HospedagemInvalidoException e) {
					System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
				}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199.50f, 456);
			hospedagem.setDiaria(2);
			hospedagem.setGrande(true);
			hospedagem.setCuidados("Animal não possui uma pata");
			servico.add(hospedagem);
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HospedagemInvalidoException e) {
					System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
				}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 0, 456);
			hospedagem.setDiaria(1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			servico.add(hospedagem);
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HospedagemInvalidoException e) {
					System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
				}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", -1, 456);
			hospedagem.setDiaria(1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			servico.add(hospedagem);
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HospedagemInvalidoException e) {
					System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
				}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199.50f, 456);
			hospedagem.setDiaria(0);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			servico.add(hospedagem);
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HospedagemInvalidoException e) {
					System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
				}
		
		try {
			Hospedagem hospedagem = new Hospedagem("Clinica Tijuca", 199.50f, 456);
			hospedagem.setDiaria(-1);
			hospedagem.setGrande(false);
			hospedagem.setCuidados("Animal não possui uma pata");
			servico.add(hospedagem);
			System.out.println("Informações de Hospedagem: " +hospedagem);
			System.out.println("Valor = " +hospedagem.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HospedagemInvalidoException e) {
					System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
				}
		
		
		//testes higiene
		try {
		Higiene higiene = new Higiene("Banho e Tosa", 80.50f, 789);
		higiene.setQuantidade(1);
		higiene.setUnhas(true);
		higiene.setDetalhes("Ter cuidado ao limpar a orelha");
		servico.add(higiene);
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
			higiene.setDetalhes("Ter cuidado ao limpar a orelha");
			servico.add(higiene);
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
			servico.add(higiene);
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
			servico.add(higiene);
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HigieneInvalidoException e) {
					System.out.println("[ERRO HIGIENE] " + e.getMessage());
				}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", 0f, 789);
			higiene.setQuantidade(1);
			higiene.setUnhas(true);
			higiene.setDetalhes("Ter cuidado ao limpar a orelha");
			servico.add(higiene);
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HigieneInvalidoException e) {
					System.out.println("[ERRO HIGIENE] " + e.getMessage());
				}
		
		try {
			Higiene higiene = new Higiene("Banho e Tosa", -1f, 789);
			higiene.setQuantidade(1);
			higiene.setUnhas(true);
			higiene.setDetalhes("Ter cuidado ao limpar a orelha");
			servico.add(higiene);
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
			higiene.setUnhas(true);
			higiene.setDetalhes("Ter cuidado ao limpar a orelha");
			servico.add(higiene);
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
			higiene.setUnhas(true);
			higiene.setDetalhes("Ter cuidado ao limpar a orelha");
			servico.add(higiene);
			System.out.println("Informações de Higiene: " +higiene);
			System.out.println("Valor = " +higiene.calcularServico());
				} catch (ValorInvalidoException e) {
					System.out.println("[ERRO VALOR] " + e.getMessage());
				} catch (HigieneInvalidoException e) {
					System.out.println("[ERRO HIGIENE] " + e.getMessage());
				}
		
		
		//teste cliente
		
		Cliente cliente = null;
		try {
			cliente = new Cliente("Hurley", "048151623-42", "teste@teste.com", "Shih-Tzu");
		} catch (ClienteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		

			try {
			Atendimento atendimento = new Atendimento(cliente);
			atendimento.setDescricao("Atendimento Teste Padrão");
			atendimento.setServico(servico);
			atendimento.setWeb(true);
			
			atendimento.impressao();
			} catch (AtendimentoSemClienteException e) {
				System.out.println("[ERRO] " + e.getMessage());
			} catch (AtendimentoSemServicoException e) {
				System.out.println("[ERRO] " + e.getMessage());
			}

		
			
		

		
	}
	

}
