package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //identifica como Controller
@RequestMapping("hello") //caminho para acessar pelo Postman
public class HelloController {

	//método
	@GetMapping
	public String hello() {
		return "Hello, Generation T45!";
	}
}
