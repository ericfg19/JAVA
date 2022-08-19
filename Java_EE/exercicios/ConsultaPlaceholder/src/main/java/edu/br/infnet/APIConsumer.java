package edu.br.infnet;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class APIConsumer {
	
	public static void main(String[] args) {
		// https://jsonplaceholder.typicode.com
		// Exemplo: https://jsonplaceholder.typicode.com/photos/1
//		  {
//			    "albumId": 1,
//			    "id": 1,
//			    "title": "accusamus beatae ad facilis cum similique qui sunt",
//			    "url": "https://via.placeholder.com/600/92c952",
//			    "thumbnailUrl": "https://via.placeholder.com/150/92c952"
//			  },	
//		
		try {
			
		// Solicitar uma requisição
			URL url = new URL ("https://jsonplaceholder.typicode.com/photos/1"); // Selecionando a url de pesquisa
//			URL url = new URL ("https://jsonplaceholder.typicode.com/photos");
			
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
