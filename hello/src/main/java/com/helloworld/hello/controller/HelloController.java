package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String  hello() {
		return "Mentalidade foi de persistência e a habilidade foi de atenção aos detalhes nessa atividade.";
	}
}
