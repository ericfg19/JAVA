package edu.br.infnet.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

	@RequestMapping(value="/{num1}/{opc}/{num2}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String greetingText(@PathVariable int num1, @PathVariable char opc, @PathVariable int num2) {
		int result;
		switch (opc) {
			case '+': 	
				result = num1 + num2;
				break;
			case '-': 	
				result = num1 - num2;
				break;
			case '*':	
				result = num1 * num2;
				break;
			case 'd':	
				result = num1 / num2;
				break;
			default: 
				result = -1;	
			}
	
		return "O resultado é "+ result;
		
	}

}
