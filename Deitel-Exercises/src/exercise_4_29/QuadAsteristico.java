package exercise_4_29;


		/*
		 Exerc�cio 4.29 - P�gina 117
		 (Quadrado de asteriscos) Escreva um aplicativo que solicita ao usu�rio que insira o tamanho 
		 o lado de um quadrado e, ent�o, exibe um quadrado vazio desse tamanho com asteriscos.
		 Seu programa deve trabalhar com quadrados de todos os comprimentos de lado poss�veis
		 entre 1 e 20.
		 * 
		 */
import java.util.Scanner;

public class QuadAsteristico {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero entre 1 e 20:");
		int row = 1, column=1;
		int asteristico = input.nextInt();
		
		if(asteristico < 1) 
			asteristico = 1;
		 else if (asteristico > 20) 
			asteristico = 20;
		
		
		while(row <= asteristico) {
			while(column <= asteristico) {
				if (row ==1) 
					System.out.print("*");
				 else if(row == asteristico) 
					System.out.print("*");
				 else if(column == 1) 
					System.out.print("*");
				 else if(column == asteristico) 
					System.out.print("*");
				 else 
					System.out.print(" ");
				
				column++;
			}
			System.out.println("");
			column = 1;
			row++;
		}
		
	}

}
