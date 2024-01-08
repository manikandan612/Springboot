package com.ebrain.springboot.training.demotraining.controller;


import org.springframework.web.bind.annotation.RestController;

import com.ebrain.springboot.training.demotraining.dto.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {
	
	@GetMapping(value="/get")
	public String helloWorldWelcomeMessage() {
		return "Welcome to spring boot hello world demo training";
	}
	 @PostMapping(value="/post")
	public HelloWorld posthelloWorldWelcomeMessage( @RequestBody HelloWorld request) {
		 System.out.println("Name:"+request.getName());
		 request.setMessage("Post mapping called successfully");
		return request;
	}
	 
}
