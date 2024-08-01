package com.example.api_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api_server.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}