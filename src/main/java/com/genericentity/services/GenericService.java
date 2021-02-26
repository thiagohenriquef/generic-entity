package com.genericentity.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.genericentity.util.Convertible;

public interface GenericService<T extends Convertible<E>, E, ID>{

	@Autowired
	JpaRepository<T, ID> getRepository();
	
	default E findById(ID id) {
		Optional<T> result = getRepository().findById(id);
		return result.get().convert();
	}
	
	default List<E> findAll() {
		List<T> list = getRepository().findAll();
		return list.stream().map(x -> x.convert()).collect(Collectors.toList());
	}
}