package edu.br.infnet;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	
	@RequestMapping(value = "/{index}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public void greetingText(@PathVariable int index) {
		try {
			
		// Solicitar uma requisição

			String site = "https://jsonplaceholder.typicode.com/photos/" + index;
			URL url = new URL (site); // Selecionando a url de pesquisa
			
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
				System.out.println("++++++++++++++++++++++++++++++++++++++++++");
				System.out.println(informationString);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++");
				
				
			}					
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
