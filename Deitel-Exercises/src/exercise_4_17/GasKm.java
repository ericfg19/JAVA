package exercise_4_17;

		/*
		 Exercício 4.17 - Página 114
		 (Quilometragem de combustível) Os motoristas se preocupam com a 
		 quilometragem obtida por seus automóveis. Um motorista monitorou 
		 várias viagens registrando a quilometragem dirigida e a quantidade 
		 de combustível em litros utilizados para cada tanque cheio.
		 Desenvolva um aplicativo Java que receba como entrada os quilômetros 
		 dirigidos e os litros de gasolina consumidos (ambos como inteiros) 
		 para cada viagem. O programa deve calcular e exibir o consumo em 
		 quilômetros/litro para cada viagem e imprimir a quilometragem 
		 total e a soma total de litros de combustível consumidos até esse 
		 ponto para todas as viagens. Todos os cálculos de média devem produzir 
		 resultados de ponto flutuante. Utilize classe SCANNER e repetição 
		 controlada por sentinela para obter os dados do usuário.
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
