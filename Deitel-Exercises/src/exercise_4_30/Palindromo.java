package exercise_4_30;

		/*
		 Exerc�cio 4.29 - P�gina 117
		 (Pal�ndromos) Um pal�ndromo � uma sequ�ncia de caracteres que � lida da esquerda para a direita
		 ou da direita para a esquerda. Por exemplo, cada um dos seguintes inteiros de cinco d�gitos
		 � um pal�ndromo: 2321, 55555, 45554 e 11611. Escreva um aplicativo que l� em um inteiro de cinco
		 d�gitos e determina se ele � ou n�o um pal�ndromo. Se o n�mero n�o for de cinco d�gitos, exiba
		 uma mensagem de erro e permita que o usu�rio insira um novo valor.
		 
		 
		 */

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		int valor, num1,num2,num4,num5, numeros;
		
		valor = 0;
		
		Scanner input = new Scanner(System.in);
		
		numeros = 0;
		
		while(numeros !=5) {
			System.out.println("Digite um n�mero de 5 d�gitos");
			valor = input.nextInt();
			
			if (valor < 100000) {
				if (valor > 9999) {
					numeros = 5;
				} else {
					System.out.println("Digite um n�mero de 5 d�gitos");
				}
			} else {
				System.out.println("Digite um n�mero de 5 d�gitos");
			}
			
			num1 = valor / 10000;
			num2 = valor % 10000 / 1000;
			num4 = valor % 10000 % 1000 % 100 / 10;
			num5 = valor % 10000 % 1000 % 100 % 10;
			
			if (num1 == num5) {
				if (num2 == num4) {
					System.out.println("Este n�mero "+valor+" � um pal�ndromo!");
				} else {
					System.out.println("Este n�mero "+valor+" n�o � um pal�ndromo!");
				}
			} else {
				System.out.println("Este n�mero "+valor+" n�o � um pal�ndromo!");
			}
			
		}
	}
}
