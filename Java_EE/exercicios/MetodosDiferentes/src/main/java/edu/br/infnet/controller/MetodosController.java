package edu.br.infnet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/requisicao")
public class MetodosController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String respondeGet() {
		return "Requisição do tipo GET";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String respondePost() {
		return "Requisição do tipo Post";
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String respondePut() {
		return "Requisição do tipo PUT";
	}
	
	@RequestMapping(method = RequestMethod.PATCH)
	public String respondePatch() {
		return "Requisição do tipo PATCH";
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public String respondeDelete() {
		return "Requisição do tipo DELETE";
	}
}
