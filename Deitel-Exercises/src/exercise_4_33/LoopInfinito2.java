package exercise_4_33;

		/*
		  Exerc�cio 4.33 - P�gina 117
		  (M�ltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na janela
		  de comando os m�ltiplos do inteiro 2 � a saber, 2, 4, 8, 16, 32, 64 e assim por diante.
		  Seu loop n�o deve terminar (isto �, deve criar um loop infinito). 
		   O que acontece quando voc� executa esse programa?
		   
		   - Coloquei limita��o do loop em "2000000" caso queira testar infinito basta alterar a condi��o em WHILE-
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
