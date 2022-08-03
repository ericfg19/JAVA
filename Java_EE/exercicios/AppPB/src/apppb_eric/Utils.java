package apppb_eric;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Utils {
	
public static int entrarInteiro(String msg) {
		
		Scanner scn = new Scanner(System.in);
		int num = 0;
		boolean ok = false;
		
		while (!ok) {
			try {
				System.out.println(msg);
				num = scn.nextInt();
				ok = true;
			}
			catch (InputMismatchException e) {
				System.out.println("NÚMERO INVÁLIDO");
				scn.next();
			}
		}
		return num;
	}
	
	public static double entrarReal(String msg) {
			
			Scanner scn = new Scanner(System.in);
			double num = 0;
			boolean ok = false;
			
			while (!ok) {
				try {
					System.out.println(msg);
					num = scn.nextDouble();
					ok = true;
				}
				catch (InputMismatchException e) {
					System.out.println("NÚMERO INVÁLIDO");
					scn.next();
				}
			}
			return num;
		}
	
	public static double entrarValor(String msg) {
		
		Scanner scn = new Scanner(System.in);
		double num = 0;
		boolean ok = false;
		
		while (!ok) {
			try {
				System.out.println(msg);
				num = scn.nextDouble();
				if (num <= 0) {
					System.out.println("Erro: VALOR INVÁLIDO");
				} else {
					ok = true;
				}
				
			}
			catch (InputMismatchException e) {
				System.out.println("Erro: NÚMERO INVÁLIDO");
				scn.next();
			}
		}
		return num;
	}
	
	public static String entrarNome(String msg) {
		Scanner scn = new Scanner(System.in);
		String nome = "";
		boolean ok = false;
		
		while (!ok) {
			System.out.println(msg);
			nome = scn.nextLine();
			String[] nomes = nome.split(" ");
			
			if (nomes.length < 2) {
				System.out.println("NOME INVÁLIDO");
			}
			else {
				ok = true;		
			}
		
			
			
		}
		
		return nome;
	}
	
	public static int pesquisarConta(int num, List<Conta> contas) {
		int achou = -1;
		
		for(int i =0; i < contas.size(); i++) {
			if(num == contas.get(i).getNum()) {
				achou = i;
				break;
			}
		}
		return achou;
	}
}
