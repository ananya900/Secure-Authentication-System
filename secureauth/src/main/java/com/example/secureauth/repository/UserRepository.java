package com.example.secureauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.secureauth.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}
