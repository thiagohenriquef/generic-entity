package com.genericentity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.genericentity.dto.CarDTO;
import com.genericentity.entities.Car;
import com.genericentity.repositories.CarRepository;

@Service
public class CarService implements GenericService<Car, CarDTO, Long>{
	
	@Autowired
	private CarRepository repository;

	@Override
	public JpaRepository<Car, Long> getRepository() {
		return repository;
	}

}
