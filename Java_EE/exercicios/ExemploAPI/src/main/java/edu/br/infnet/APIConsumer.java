package edu.br.infnet;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APIConsumer {
	
	static String urlCep = "http://viacep.com.br/ws/";

	public static void main(String[] args) {
		
		
		System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        
        String urlChamada = urlCep + cep + "/json";
		
		// https://viacep.com.br/
		// Exemplo; viacep.com.br/ws/01001000/json/
		
		
		try {
			
		// Solicitar uma requisição
			URL url = new URL (urlChamada); // Selecionando a url de pesquisa
			HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // Criando um objeto de conexão
			conn.setRequestMethod("GET"); // Estabelecendo que o verbo de conexão será o "GET"
			conn.connect(); // Estabelecendo a conexão
		
		// Requisição aceita?
			int responseCode = conn.getResponseCode();
			if (responseCode != 200) {
				throw new RuntimeException("Ocorreu um ERRO: " + responseCode); 
				
			} else { // Abrir um Scanner para ler o fluxo de dados
				StringBuilder informationString = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());
				
				while (scanner.hasNext()){
					informationString.append(scanner.nextLine());
				}
				
				scanner.close();
				
				// Imprimir resultado da consulta 
				System.out.println(informationString);
				
				
			}					
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
