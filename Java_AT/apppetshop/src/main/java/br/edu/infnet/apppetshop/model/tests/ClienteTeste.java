package br.edu.infnet.apppetshop.model.tests;

import br.edu.infnet.apppetshop.model.domain.Cliente;
import br.edu.infnet.apppetshop.model.exceptions.ClienteInvalidoException;

public class ClienteTeste {
		
public static void main(String[] args) {
		
		
		try {
			Cliente cliente = new Cliente("Hurley", "048151623-42", "teste@teste.com", "Shih-Tzu");
			System.out.println(cliente);
		} catch (ClienteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Cliente cliente = new Cliente("Hurley", null, "teste@teste.com", "Shih-Tzu");
			System.out.println(cliente);
		} catch (ClienteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Cliente cliente = new Cliente("Hurley", "048151623-42", null, "Shih-Tzu");
			System.out.println(cliente);
		} catch (ClienteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
		
		try {
			Cliente cliente = new Cliente("Hurley", "048151623-42", "teste@teste.com", null);
			System.out.println(cliente);
		} catch (ClienteInvalidoException e) {
			System.out.println("[ERRO] " + e.getMessage());
		}
	}
	
}
