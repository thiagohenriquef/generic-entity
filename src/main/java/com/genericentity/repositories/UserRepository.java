package com.genericentity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genericentity.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
