package com.genericentity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genericentity.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
