package fundamentosjava_tp1;

import java.util.Scanner;

public class notas_colegio {


    private static String[] nomes;
    private static double[] notasAV1;
    private static double[] notasAV2;
    private static final int QTD = 100;
    private static int indiceAluno = 0;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        nomes = new String[QTD];
        notasAV1 = new double[QTD];
        notasAV2 = new double[QTD];

        String opcao;

        do {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Sistema de controle de notas do Col�gio Exemplo");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
			Thread.sleep(600);
            System.out.println("Selecione uma das op��es a seguir:");
            System.out.println("[1] Registrar notas de um novo aluno.");
            System.out.println("[2] Consultar boletim final de um aluno.");
            System.out.println("[3] Consultar todas as notas da turma.");
            System.out.println("[4] Sair");
			System.out.println("[9] Mais informa��es");
			Thread.sleep(300);
			System.out.println("\n");
            System.out.println("Informe a op��o desejada:");
            System.out.println("\n");
            opcao = in.next();

            switch (opcao) {
                case "1":
                    registrarNotas();
                    break;
                case "2":
                    consultNotasAluno();
                    break;
                case "3":
                    consultNotasTurma();
                    break;
                case "4":
                    System.out.println("Finalizando");
                    break;
				case "9":
                    informacoes();
                    break;
                default:
                    System.out.println("Op��o inv�lida!");
                    System.out.println("\n");
                    break;
            }
        } while (!opcao.equals("4"));

        in.close();
    }

    private static void registrarNotas() throws InterruptedException {
    	System.out.println("\n");
        System.out.println("Registrar notas do aluno");
        System.out.println("------------------------\n");
        if (indiceAluno < QTD) {
            System.out.println("Informe o nome do aluno:");
            nomes[indiceAluno] = in.next();

            notasAV1[indiceAluno] = solicitaNota("1");
            notasAV2[indiceAluno] = solicitaNota("2");
            indiceAluno += 1;
        } else {
        	Thread.sleep(50);
            System.out.println("===========================================");
            System.out.println("Limite para cadastramento de notas esgotado.");
            System.out.println("===========================================\n");
            Thread.sleep(100);
        }
    }

    private static double solicitaNota(String avaliacao){
        String nota;
        double retornoNota;
        while (true) {
            System.out.println("Informe a nota obtida na Avalia��o " + avaliacao);
            nota = in.next();
            try {
                retornoNota = Double.parseDouble(nota);
                break;
            } catch (NumberFormatException e) {
                System.out.println("A nota deve que ser um n�mero.");
                System.out.println("Digite novamente.");
                System.out.println("\n");
            }
        }
        return retornoNota;
    }

    private static void consultNotasTurma() throws InterruptedException {
        if (indiceAluno != 0) {

            System.out.println("\nConsultar notas da turma");
            System.out.println("------------------------\n");
            for (int i = 0; i < indiceAluno; i++) {

                imprimir(i);
                Thread.sleep(50);
            }
        } else {
        	Thread.sleep(100);
            System.out.println("============================");
            System.out.println("N�o existe registro de aluno!");
            System.out.println("============================\n");
            Thread.sleep(100);
        }
    }

    private static void consultNotasAluno() throws InterruptedException {
        String posStr;
        int posInt;
        if (indiceAluno != 0) {
            while (true) {
                System.out.println("Informe a posi��o do aluno:");
                posStr = in.next();
                try {
                    posInt = Integer.parseInt(posStr);
                    if (posInt >= indiceAluno) {
                        System.out.println("A posi��o do aluno deve ser um n�mero e entre 0 e " + (indiceAluno - 1));
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("A posi��o do aluno deve ser um n�mero e entre 0 e " + (indiceAluno - 1));
                }
            }
            System.out.println("\n");
            System.out.println("Consultar notas do Aluno");
            System.out.println("------------------------\n");
            Thread.sleep(50);
            imprimir(posInt);

        } else {
            System.out.println("=============================");
            System.out.println("N�o existe registro de aluno!");
            System.out.println("=============================\n");
            Thread.sleep(100);
        }
    }
    private static double calculaMediaNotas(int posicaoInt){
        return (notasAV1[posicaoInt] + notasAV2[posicaoInt]) / 2;
    }
    private static String retornaResultado(double media){
        if (media < 4) {
            return "Reprovado";
        } else if (media >= 4 && media < 7) {
            return "Prova final";
        } else {
            return "Aprovado";
        }

    }
    private static void imprimir(int posInt) throws InterruptedException{
        double media = calculaMediaNotas(posInt);
        String resultado = retornaResultado(media);
        Thread.sleep(100);
        System.out.printf("Posi��o:          %d", posInt);
        System.out.printf("\nNome do aluno:    %s", nomes[posInt]);
        System.out.printf("\nNota Avalia��o 1: %.1f", notasAV1[posInt]);
        System.out.printf("\nNota Avalia��o 2: %.1f", notasAV2[posInt]);
        System.out.printf("\nM�dia das notas:  %.1f", media);
        System.out.printf("\nResultado final:  %s", resultado + "\n");
        System.out.println("---------------------------------------\n");
        Thread.sleep(400);
    }
    
    private static void informacoes() throws InterruptedException {
    	System.out.println("\n");
    	Thread.sleep(100);
    	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    	System.out.println("-=-=-=-=-=-=-=- � TP1 - Sistema de Notas �2022 � -=-=-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-=-= # Instituto Infnet # -=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("-=-=-=-=-=-=| An�lise e Desenvolvimento de Sistemas |-=-=-=-=-=-=-=-");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-� Eric F Guimar�es �-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("-=-=-=-=-=-=|  Fundamentos de Desenvolvimento JAVA  |-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-| 11/05/2022 - Rio de Janeiro |-=-=-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-# Professor  - Elberth Moraes #-=-=-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		Thread.sleep(100);
		System.out.println("\n");
		Thread.sleep(500);

		
    }
}

