package exercise_2_34;


		/*
		  Exercício 2.34 - Página 54
		  (Calculadora de crescimento demográfico mundial)
		  Utilize a internet para descobrir a população mundial atual 
		  e a taxa de crescimento demográfico mundial anual. 
		  Escreva um aplicativo que introduza esses valores e, então, que exiba 
		  a população mundial estimada depois de um, dois, três, quatro e cinco anos.
		 */

import java.util.Scanner;

public class PopCalc {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da população humana: ");
		double popmundial = scan.nextDouble();
		
		System.out.println("Digite a taxa de crescimento demográfico: ");
		double taxanum = scan.nextDouble();
		
		double taxasum = (taxanum * popmundial) / 100;
		double popano1 = popmundial + taxasum;
		System.out.printf("População Mundial após o 1 ano = %.3f \n",popano1);
		
		double popano2 = (taxanum * popano1) / 100;
		double taxacres2 = popano2 + popano1;
		System.out.printf("População Mundial após o 2º ano = %.3f \n",taxacres2);
		
		double popano3 = (taxanum * taxacres2) / 100;
		double taxcres3 = taxacres2 + popano3;
		System.out.printf("População Mundial após o 3º ano = %.3f \n",taxcres3);
		
		double popano4 = (taxanum * taxcres3) / 100;
		double taxacres4 = popano4 + taxcres3;
		System.out.printf("População Mundial após o 4º ano = %.3f \n",taxacres4);
		
		double popano5 = (taxanum * taxacres4) / 100;
		double taxacres5 = popano5 + taxacres4;
		System.out.printf("População Mundial após o 5º ano = %.3f \n",taxacres5);
		
		scan.close();
		
	}
}
