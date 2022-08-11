package apppb_contas;

import static apppb_contas.Conta.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Arquivo {
	private static String arq;
	
	public static void setArq(String nome) {
		arq = nome;
	}
	
	public static Scanner abrirLeitura() {
		Scanner entrada = null;
		
		try {
			entrada = new Scanner(new File(arq));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		return entrada;
	}
	
	public static List<Conta> lerContas(Scanner entrada) {
		String linha;
		String[] campos;
		List<Conta> contas = new ArrayList<Conta>();
		
		while (entrada.hasNext()) {
			linha = entrada.nextLine();
			campos = linha.split(";");
			int numero = Integer.parseInt(campos[0]);
			String nome = campos[1];
			float saldo = Float.parseFloat(campos[2]);
			contas.add(new Conta(numero, nome, saldo));
		}
		
		return contas;
	}
	
	public static Formatter abrirGravacao() {
		Formatter saida = null;
		try {
			saida = new Formatter(arq);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		return saida;
	}
	
	public static void gravarContas(Formatter saida, List<Conta> contas) {
		
		for (Conta conta : contas) {
			saida.format("%d;%s;%.2f\n", conta.getNum(), conta.getNome(), conta.getSaldo());
		}
	}
	
	public static void fecharArquivo(Scanner entrada) {
		if (entrada != null) {
			entrada.close();
		}
	}
	
	public static void fecharArquivo(Formatter saida) {
		if (saida != null) {
			saida.close();
		}
	}
	
}
