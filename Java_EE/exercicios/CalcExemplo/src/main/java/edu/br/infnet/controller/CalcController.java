package edu.br.infnet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "/calc")
public class CalcController {
	
	@RequestMapping(path = {"/sum"})
	public int soma(@RequestParam(name = "a") int a,
					@RequestParam(name = "b") int b) {
		return a + b;
	}
	
	@RequestMapping(path = {"/sub"})
	public int subtracao(@RequestParam(name = "a") int a,
						@RequestParam(name = "b") int b) {
		return a - b;
	}
	
	@RequestMapping(path = {"/multi"})
	public int multiplicacao(@RequestParam(name = "a") int a,
						    @RequestParam(name = "b") int b) {
		return a * b;
	}
	
	@RequestMapping(path = {"/div"})
	public int divisao(@RequestParam(name = "a") int a,
					   @RequestParam(name = "b") int b) {
		return a / b;
	}
}
