package exercise_4_17;

		/*
		 Exerc�cio 4.17 - P�gina 114
		 (Quilometragem de combust�vel) Os motoristas se preocupam com a 
		 quilometragem obtida por seus autom�veis. Um motorista monitorou 
		 v�rias viagens registrando a quilometragem dirigida e a quantidade 
		 de combust�vel em litros utilizados para cada tanque cheio.
		 Desenvolva um aplicativo Java que receba como entrada os quil�metros 
		 dirigidos e os litros de gasolina consumidos (ambos como inteiros) 
		 para cada viagem. O programa deve calcular e exibir o consumo em 
		 quil�metros/litro para cada viagem e imprimir a quilometragem 
		 total e a soma total de litros de combust�vel consumidos at� esse 
		 ponto para todas as viagens. Todos os c�lculos de m�dia devem produzir 
		 resultados de ponto flutuante. Utilize classe SCANNER e repeti��o 
		 controlada por sentinela para obter os dados do usu�rio.
		 */

import java.util.Scanner;

public class GasKm {
	
	private static Scanner scan;

	public static void main(String[] args) {
		int kms, litrogas = 0, totalKms = 0, totalGas = 0;
		float kmsPorGas, totalKmsPorGas;
		
		scan = new Scanner(System.in);
		System.out.println("Digite os Kilometros: ");
		kms = scan.nextInt();
		
		while(kms != -1)
		{
			System.out.println("Digite os litros: ");
			litrogas = scan.nextInt();
			totalKms = totalKms + kms;
			totalGas = totalGas + litrogas;
			
			if( litrogas != -1) 
			{
				kmsPorGas = (float)kms / litrogas;
				System.out.printf("Km por litro de Gasolina = "+kmsPorGas+"\n");	
			}
			
			totalKmsPorGas = (float)totalKms / totalGas;
			System.out.printf("Total de Kilometros por gasolina: "+totalKmsPorGas+"\n");
			
			break;
		}
		
		
		
		
	}

}
