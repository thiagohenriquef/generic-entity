package com.genericentity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.genericentity.dto.CompanyDTO;
import com.genericentity.entities.Company;
import com.genericentity.repositories.CompanyRepository;

@Service
public class CompanyService implements GenericService<Company, CompanyDTO, Long>{
	
	@Autowired
	private CompanyRepository repository;

	@Override
	public JpaRepository<Company, Long> getRepository() {
		return repository;
	}

}
