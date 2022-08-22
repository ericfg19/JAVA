package edu.br.infnet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.br.infnet.model.User;

@RestController
@RequestMapping(path = "/user" )
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/random")
	public User obterUser() {
		return new User(1, "Teste", "21-2199-2199");
	}
	
}
