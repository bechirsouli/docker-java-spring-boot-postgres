package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index(
			@RequestParam(name = "name", required = false, defaultValue = " HELLO Bechir Souli AND  hatem trabelsi") String name
		) {
		return "Hello " + name;
	}
}
