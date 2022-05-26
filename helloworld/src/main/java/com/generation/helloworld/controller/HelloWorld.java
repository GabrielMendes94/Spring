package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica que a classe abaixo é uma classe controladora
@RestController   //ctrl + shift + o importar automaticamente

//serve para a construção dos endpoints da api
@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String hello() {
		return "Olá mundo!<br><br>MENTALIDADES:<br>"
				+"- Orientação ao Futuro<br>- Responsabilidade Pessoal<br>"
				+"- Mentalidade de Crescimento<br>- Persistência<br><br>"
				+"HABILIDADES:<br>- Trabalho em Equipe<br>- Atenção aos Detalhes<br>"
				+"- Proatividade<br>- Comunicação";
	}
}
