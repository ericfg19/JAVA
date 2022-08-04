package testes;

import java.util.List;

import apppb_contas.Conta;

public class Test {
	
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
}
