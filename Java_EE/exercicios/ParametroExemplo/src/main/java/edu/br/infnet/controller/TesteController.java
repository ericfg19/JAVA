package edu.br.infnet.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String X(@PathVariable String name) {
		return " Hello " + name + " !";
	}

}
