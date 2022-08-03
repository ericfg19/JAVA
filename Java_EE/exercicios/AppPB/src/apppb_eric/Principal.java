package apppb_eric;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static apppb_eric.Utils.*;

public class Principal {
	
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		
		
		mockContas(contas);
		exibirContas(contas);
		deletarContas(contas);
		//incluirConta(contas);
		exibirContas(contas);
	}
	
	
	
	public static void incluirConta(List<Conta> contas) {
		
		
		int num = entrarInteiro("Entre com o número da conta: \n");
		int achou = pesquisarConta(num, contas);
		
		if(achou != -1) {
			System.out.println("Erro: Conta já existe!");
			return;
		}
		
		String nome = entrarNome("Entre com o nome do cliente: ");
		double saldo = entrarReal("Entre com o valor do saldo: ");
		
		contas.add(new Conta(num, nome, saldo));
	}
	
	public static void deletarContas(List<Conta> contas) {
		
		if(contas.isEmpty()) {
			System.out.println("Erro: Não existem contas registradas!\n");
			return;
		}
		
		int num = entrarInteiro("Entre com o número da conta: \n");
		int achou = pesquisarConta(num, contas);
		if(achou == -1) {
			System.out.println("Erro: Conta não existe!\n");
			return;
		}
		
		contas.remove(achou);
		
	}
	
	public static void exibirContas(List<Conta> contas) {
		
		for (var conta : contas) {
			System.out.println(conta);
		}
	}
	
	public static void mockContas(List<Conta> contas) {
		Conta conta = new Conta(1, "E RT", 100);
		
		contas.add(conta);
		conta = new Conta(2, "E FG", 100);
		contas.add(conta);
		conta = new Conta(3, "E VB", 300);
		contas.add(conta);
		conta = new Conta(4, "E NM", 400);
		contas.add(conta);
	}
	
	public static void alterarContas(List<Conta> contas) {
		
		if(contas.isEmpty()) {
			System.out.println("Erro: Não existem contas registradas!");
			return;
		}
		
		int num = entrarInteiro("Entre com o número da conta: \n");
		int achou = pesquisarConta(num, contas);
		if(achou == -1) {
			System.out.println("Erro: Conta não existe!");
			return;
		}
	}
}
