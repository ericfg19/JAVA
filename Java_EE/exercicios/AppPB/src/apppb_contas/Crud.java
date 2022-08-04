package apppb_contas;

import static apppb_contas.Utils.entrarInteiro;
import static apppb_contas.Utils.entrarNome;
import static apppb_contas.Utils.entrarOperacao;
import static apppb_contas.Utils.entrarReal;
import static apppb_contas.Utils.entrarValor;
import static apppb_contas.Utils.pesquisarConta;

import java.util.List;

public class Crud {
		
	//adicionar
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
	
	//deletar
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
	
	//exibir
	public static void exibirContas(List<Conta> contas) {
		
		for (var conta : contas) {
			System.out.println(conta);
		}
	}
	
	//alterar
	public static void alterarSaldo(Conta conta) {
		
		double valor = entrarValor("Entre com o valor");
		
		int oper = entrarOperacao();
		if(oper == 1) {
			conta.creditar(valor);
		}
		else {
			conta.debitar(valor);
		}
		
	}
	
	public static void alterarConta(List<Conta> contas) {
		
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
		
		alterarSaldo(contas.get(achou));
		
	}
}
