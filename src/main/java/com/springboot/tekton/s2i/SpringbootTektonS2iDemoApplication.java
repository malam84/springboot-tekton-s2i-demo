package com.springboot.tekton.s2i;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootTektonS2iDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTektonS2iDemoApplication.class, args);
	}

	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String getHello() {
		System.out.println("Hello World!");
		return "Hello World";
	}
}
