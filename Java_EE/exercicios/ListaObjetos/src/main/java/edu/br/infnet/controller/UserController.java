package edu.br.infnet.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.br.infnet.model.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/all")
	public ArrayList<User> obterUser() {
		ArrayList<User> users = new  ArrayList<>();
		User user1 = new User(1, "Tester", "555.555.111-99");
		users.add(user1);
		User user2 = new User(2, "Contoso", "555.555.222-99");
		users.add(user2);
		User user3 = new User(3, "Hurley", "555.555.333-99");
		users.add(user1);
		return users;
	}

}
