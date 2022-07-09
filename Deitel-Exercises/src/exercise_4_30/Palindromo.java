package exercise_4_30;

		/*
		 Exercício 4.29 - Página 117
		 (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita
		 ou da direita para a esquerda. Por exemplo, cada um dos seguintes inteiros de cinco dígitos
		 é um palíndromo: 2321, 55555, 45554 e 11611. Escreva um aplicativo que lê em um inteiro de cinco
		 dígitos e determina se ele é ou não um palíndromo. Se o número não for de cinco dígitos, exiba
		 uma mensagem de erro e permita que o usuário insira um novo valor.
		 
		 
		 */

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		int valor, num1,num2,num4,num5, numeros;
		
		valor = 0;
		
		Scanner input = new Scanner(System.in);
		
		numeros = 0;
		
		while(numeros !=5) {
			System.out.println("Digite um número de 5 dígitos");
			valor = input.nextInt();
			
			if (valor < 100000) {
				if (valor > 9999) {
					numeros = 5;
				} else {
					System.out.println("Digite um número de 5 dígitos");
				}
			} else {
				System.out.println("Digite um número de 5 dígitos");
			}
			
			num1 = valor / 10000;
			num2 = valor % 10000 / 1000;
			num4 = valor % 10000 % 1000 % 100 / 10;
			num5 = valor % 10000 % 1000 % 100 % 10;
			
			if (num1 == num5) {
				if (num2 == num4) {
					System.out.println("Este número "+valor+" é um palíndromo!");
				} else {
					System.out.println("Este número "+valor+" não é um palíndromo!");
				}
			} else {
				System.out.println("Este número "+valor+" não é um palíndromo!");
			}
			
		}
	}
}
