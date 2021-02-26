package com.genericentity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genericentity.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
