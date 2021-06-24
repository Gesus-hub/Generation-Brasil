package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController 
{
	@GetMapping
	public String hello() 
	{
		return "Hello Generation!!!"
				+"\nPara realizar essa atividade foi necessario persistencia e "
				+ "mentalidade de crescimento!";
	}
	
	public String hello2()
	{
		return "O objetivo e aprender todas as aplicacoes de um "
				+ "Spring-boot para um desenvolvedor Jr!";
	}
}
