package apppb_contas;

import static apppb_contas.Crud.alterarConta;
import static apppb_contas.Crud.deletarContas;
import static apppb_contas.Crud.exibirContas;
import static apppb_contas.Crud.incluirConta;
import static apppb_contas.Utils.entrarInteiro;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	
	public static void main(String[] args) {
		final int FIM = 0;
		final String NOMEARQ = "contas.txt";
		
		List<Conta> contas = new ArrayList<>();
		
		int opcao;
		
		//mockContas(contas);
		
		Arquivo.setArq(NOMEARQ);
		//lerArquivo;
		Scanner entrada = Arquivo.abrirLeitura();
		if (entrada == null) {
			System.out.println("Erro: Arquivo não existe!\n");
			return;
		}
		contas = Arquivo.lerContas(entrada);
		
		
		
		opcao = entrarOpcao();
		while (opcao != FIM) {
			
			switch (opcao) {
				case 1: {
					incluirConta(contas);
					break;
				}
				case 2: {
					alterarConta(contas);
					break;
				}
				case 3: {
					deletarContas(contas);
					break;
				}
				case 4: {
					exibirContas(contas);
					break;
				}
			}
			opcao = entrarOpcao();
		}
		//gravarArquivo;
		Formatter saida = Arquivo.abrirGravacao();
		Arquivo.gravarContas(saida, contas);
		Arquivo.fecharArquivo(saida);
	}
	
	public static int entrarOpcao() {
		int opcao;
		boolean ok = false;
		
		do {
			menu();
			opcao = entrarInteiro("Entre com uma opção: ");
			if ((opcao < 0) || (opcao > 4)) {
				System.out.println("Opção inválida!");
			} else {
				ok = true;
			}
		} while (!ok);
		
		return opcao;
	}
	
	
	public static void menu() {
		
		System.out.println("###-MENU-###");
		System.out.println("[1] Incluir");
		System.out.println("[2] Alterar");
		System.out.println("[3] Excluir");
		System.out.println("[4] Listar");
		System.out.println("[0] Sair");
		
		
	}
	
	
	
}
