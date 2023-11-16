package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index(
			@RequestParam(name = "name", required = false, defaultValue = "Bechir Souli") String name
		) {
		return "Hello " + name;
	}
}