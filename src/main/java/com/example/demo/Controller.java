package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Hello World!");
	}

}
