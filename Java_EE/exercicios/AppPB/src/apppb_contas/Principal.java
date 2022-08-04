package apppb_contas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static apppb_contas.Crud.*;
import static apppb_contas.Utils.*;
import static testes.Test.*;

public class Principal {
	
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		
		
		mockContas(contas);
		exibirContas(contas);
		//deletarContas(contas);
		//incluirConta(contas);
		alterarConta(contas);
		exibirContas(contas);
	}
	
	
	
	
	
}
