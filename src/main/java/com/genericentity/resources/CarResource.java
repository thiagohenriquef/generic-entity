package com.genericentity.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genericentity.dto.CarDTO;
import com.genericentity.services.CarService;

@RequestMapping(path = "/cars")
@RestController
public class CarResource {

	@Autowired
	private CarService service;

	@GetMapping
	public ResponseEntity<List<CarDTO>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CarDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}
}
