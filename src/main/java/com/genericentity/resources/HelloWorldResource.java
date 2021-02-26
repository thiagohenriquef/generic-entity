package com.genericentity.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/generics")
public class HelloWorldResource {

	@GetMapping
	public ResponseEntity<String> helloGenerics() {
		return ResponseEntity.ok("Hello Generics!");
	}
}
