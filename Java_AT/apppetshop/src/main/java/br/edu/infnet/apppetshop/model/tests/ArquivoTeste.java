package br.edu.infnet.apppetshop.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

public class ArquivoTeste {
	
	public static void main(String[] args) {
		
			
			try {			
				String dir = "c:/dev/";
				String arq = "atendimentos.txt"; //arquivo txt se encontra em ".\src\main\resources\static"
		
				try {
					FileReader fileR = new FileReader(dir+arq);
					BufferedReader leitura = new BufferedReader(fileR);
					
					FileWriter fileW = new FileWriter(dir+"out_"+arq);
					BufferedWriter escrita = new BufferedWriter(fileW);
					
					String linha = leitura.readLine();
					
					Atendimento atendimento = null;
					List<Servico> servico = new ArrayList<Servico>();
					
					while(linha != null) {
						String[] campos = linha.split(";");
						
						String opcao = campos[0];
						
						switch (opcao.toUpperCase()) {
						
						case "A":				
							Cliente cliente = null;
							try {
								cliente = new Cliente(campos[3], campos[4], campos[5], campos[6]);
							} catch (ClienteInvalidoException e) {
								System.out.println("[ERRO] " + e.getMessage());
							}
							

								try {
								atendimento = new Atendimento(cliente);
								atendimento.setDescricao(campos[1]);
								atendimento.setServico(servico);
								atendimento.setWeb(Boolean.valueOf(campos[2]));
								
								atendimento.impressao();
								} catch (AtendimentoSemClienteException e) {
									System.out.println("[ERRO] " + e.getMessage());
								} catch (AtendimentoSemServicoException e) {
									System.out.println("[ERRO] " + e.getMessage());
								}	
							break;
						case "1":					
							try {
								Exame exame = new Exame(campos[1], Float.valueOf(campos[2]), Integer.valueOf(campos[3]));
								exame.setConsulta(Integer.valueOf(campos[4]));
								exame.setVacina(Boolean.valueOf(campos[5]));
								exame.setInformacao(campos[6]);
								servico.add(exame);
								System.out.println("Informações do Exame: " + exame);
								System.out.println("Valor = " +exame.calcularServico());
									} catch (ValorInvalidoException e) {
										System.out.println("[ERRO VALOR] " + e.getMessage());
									} catch (ExameInvalidoException e) {
										System.out.println("[ERRO EXAME] " + e.getMessage());
									}

							break;
						case "2":
							try {
								Hospedagem hospedagem = new Hospedagem(campos[1], Float.valueOf(campos[2]), Integer.valueOf(campos[3]));
								hospedagem.setDiaria(Integer.valueOf(campos[4]));
								hospedagem.setGrande(Boolean.valueOf(campos[5]));
								hospedagem.setCuidados(campos[6]);
								servico.add(hospedagem);
								System.out.println("Informações de Hospedagem: " +hospedagem);
								System.out.println("Valor = " +hospedagem.calcularServico());
									} catch (ValorInvalidoException e) {
										System.out.println("[ERRO VALOR] " + e.getMessage());
									} catch (HospedagemInvalidoException e) {
										System.out.println("[ERRO HOSPEDAGEM] " + e.getMessage());
									}

							break;
						case "3":
							try {
								Higiene higiene = new Higiene(campos[1], Float.valueOf(campos[2]), Integer.valueOf(campos[3]));
								higiene.setQuantidade(Integer.valueOf(campos[4]));
								higiene.setUnhas(Boolean.valueOf(campos[5]));
								higiene.setDetalhes(campos[6]);
								servico.add(higiene);
								System.out.println("Informações de Higiene: " +higiene);
								System.out.println("Valor = " +higiene.calcularServico());
									} catch (ValorInvalidoException e) {
										System.out.println("[ERRO VALOR] " + e.getMessage());
									} catch (HigieneInvalidoException e) {
										System.out.println("[ERRO HIGIENE] " + e.getMessage());
									}

							break;
						default:
							System.out.println("Tipo inválido!");
							break;
						}
						
						linha = leitura.readLine();
					}
					
					if(atendimento != null) {
						escrita.write(atendimento.obterDadosArquivo());
					}

					leitura.close();
					fileR.close();
					escrita.close();
					fileW.close();
				} catch (IOException e) {
					System.out.println("[ERRO] " + e.getMessage());
				}
			} finally {
				System.out.println("PROCESSAMENTO REALIZADO!!!");
			}		
		}
}


