package com.jwt.demo.jwtspringsecurity3.repository;

import com.jwt.demo.jwtspringsecurity3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,String> {

    public Optional<User> findByEmail(String email);
}
