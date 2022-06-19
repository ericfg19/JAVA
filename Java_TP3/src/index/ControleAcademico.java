package index;

import classes.Aluno;
import classes.Pessoa;
import classes.Professor;
import exception.EmailInvalidoException;
import exception.NomeIncompletoException;

import java.util.Scanner;

import static heranca.Constante.QTD;

public class ControleAcademico {
    static Scanner in = new Scanner(System.in);
    private static int indice = 0;

    private static Pessoa[] pessoas;

    public static void main(String[] args) throws InterruptedException {

        pessoas = new Pessoa[QTD];
        String opcao;

        try {

            do {
            	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Sistema de Registro Academico - Colégio Exemplo");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
    			Thread.sleep(600);
                System.out.println("Selecione uma das opções a seguir:");
                System.out.println("[1] Cadastrar professor");
                System.out.println("[2] Cadastrar aluno");
                System.out.println("[3] Consultar situação de um Professor/Aluno cadastrado");
                System.out.println("[4] Sair");
                System.out.println("[9] Mais informações");
                System.out.println("\nInforme a opção desejada:");
                opcao = in.next();

                switch (opcao) {
                    case "1":
                        try {
                            cadastrarProfessor();
                        } catch (EmailInvalidoException | NomeIncompletoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "2":
                        try {
                            cadastrarAluno();
                        } catch (EmailInvalidoException | NomeIncompletoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "3":
                        consultarDocenteDiscente();
                        break;
                    case "4":
                        System.out.println("Finalizando...");
                        break;
                    case "9":
                        informacoes();
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            } while (!opcao.equals("4"));

        } finally {
            in.close();
        }

    }

    private static void cadastrarProfessor() throws EmailInvalidoException, NomeIncompletoException {
        Professor professor = new Professor();

        System.out.println("\nCadastrar Professor");
        System.out.println("-------------------\n");
        if (indice < QTD) {
            System.out.println("Informe o nome do professor:");
            in.nextLine();
            professor.setNome(in.nextLine());

            int idade = recebeVariavelInt("Informe a idade do professor:");
            professor.setIdade(idade);

            System.out.println("Informe o e-mail do professor:");
            professor.setEmail(in.next());

            System.out.println("Informe a disciplina que o professor leciona:");
            professor.setDisciplina(in.next());

            int cargaHoraria = recebeVariavelInt("Informe a carga horária do professor:");
            professor.setCargaHoraria(cargaHoraria);

            float valorHora = recebeVariavelFloat("Informe o valor por hora do professor:");
            professor.setValorHora(valorHora);

            professor.setId(indice);

            pessoas[indice] = professor;

            System.out.println("Cadastro realizado:");
            pessoas[indice].imprimir();

            indice += 1;

        } else {
        	System.out.println("=============================================");
            System.out.println("Limite para cadastramento de pessoas esgotado.");
            System.out.println("=============================================\n");
        }
    }

    private static void cadastrarAluno() throws EmailInvalidoException, NomeIncompletoException {
        Aluno aluno = new Aluno();

        System.out.println("\nCadastrar Aluno");
        System.out.println("-------------------\n");
        if (indice < QTD) {
            System.out.println("Informe o nome do aluno:");
            in.nextLine();
            aluno.setNome(in.nextLine());

            int idade = recebeVariavelInt("Informe a idade do aluno:");
            aluno.setIdade(idade);

            System.out.println("Informe o e-mail do aluno:");
            aluno.setEmail(in.next());

            System.out.println("Informe o curso do aluno:");
            aluno.setCurso(in.next());

            boolean matriculado = recebeVariavelBoolean("Informe se o aluno está matriculado: /n (||0 - não || 1 - sim||)");
            aluno.setMatriculado(matriculado);

            float valorMensalidade = recebeVariavelFloat("Informe o valor da mensalidade:");
            aluno.setValorMensalidade(valorMensalidade);
            aluno.setId(indice);

            pessoas[indice] = aluno;

            System.out.println("Cadastro realizado:");
            pessoas[indice].imprimir();

            indice += 1;

        } else {
            System.out.println("=============================================");
            System.out.println("Limite para cadastramento de pessoas esgotado.");
            System.out.println("=============================================\n");
        }
    }

    private static int recebeVariavelInt(String texto) {
        String variavel;
        int variavelInt;
        while (true) {
            System.out.println(texto);
            variavel = in.next();
            try {
                variavelInt = Integer.parseInt(variavel);
                break;
            } catch (NumberFormatException e) {
                System.out.println("A informação deve ser um número inteiro...");
            }
        }
        return variavelInt;
    }

    private static float recebeVariavelFloat(String texto) {
        String variavel;
        float variavelFloat;
        while (true) {
            System.out.println(texto);
            variavel = in.next();
            try {
                variavelFloat = Float.parseFloat(variavel);
                break;
            } catch (NumberFormatException e) {
                System.out.println("A informação deve ser um número.");
            }
        }
        return variavelFloat;
    }

    private static boolean recebeVariavelBoolean(String texto) {
        String variavel;
        int variavelInt;
        boolean variavelBoolean;
        while (true) {
            System.out.println(texto);
            variavel = in.next();

            try {
                variavelInt = Integer.parseInt(variavel);
                if (variavelInt == 1) {
                    variavelBoolean = true;
                    break;
                } else {
                    if (variavelInt == 0) {
                        variavelBoolean = false;
                        break;
                    } else {
                        System.out.println("A informação de entrada deve ser 0 ou 1 .");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("A informação de entrada deve ser um número: 0 ou 1 .");
            }
        }
        return variavelBoolean;
    }

    private static void consultarDocenteDiscente() throws InterruptedException {
        int pos = indice + 1;
        
       
	     while (pos > indice) {
	       pos = recebeVariavelInt("Informe a posição que deseja visualizar:");
	        }
	       pessoas[pos].imprimir(); 
        
        
    }
    private static void informacoes() throws InterruptedException {
    	System.out.println("\n");
    	Thread.sleep(100);
    	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    	System.out.println("-=-=-=-=-=-=-=¨TP3 - Sistema de Controle Academico¨-=-=-=-=-=-=-=-=-=");
		System.out.println("=-=-=-=-=-=-=-=-=-=-= # Instituto Infnet # -=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("-=-=-=-=-=-=| Análise e Desenvolvimento de Sistemas |-=-=-=-=-=-=-=-");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-¨ Eric F Guimarães ¨-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("-=-=-=-=-=-=|  Fundamentos de Desenvolvimento JAVA  |-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-| 19/06/2022 - Rio de Janeiro |-=-=-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-# Professor  - Elberth Moraes #-=-=-=-=-=-=-=-=-=-");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Thread.sleep(600);
		System.out.println("\n");
		Thread.sleep(100);

		
    }
}
