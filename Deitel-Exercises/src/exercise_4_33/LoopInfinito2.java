package exercise_4_33;

		/*
		  Exercício 4.33 - Página 117
		  (Múltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na janela
		  de comando os múltiplos do inteiro 2 — a saber, 2, 4, 8, 16, 32, 64 e assim por diante.
		  Seu loop não deve terminar (isto é, deve criar um loop infinito). 
		   O que acontece quando você executa esse programa?
		   
		   - Coloquei limitação do loop em "2000000" caso queira testar infinito basta alterar a condição em WHILE-
		 */

public class LoopInfinito2 {
		
	public static void main(String[] args) {
		int num = 1;
		while (num <= 2000000) {
			num = num * 2;
			System.out.println(num);
			
			
		}
		
	}
}
