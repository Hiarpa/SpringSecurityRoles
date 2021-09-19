package com.amigoscode.JWTAmigos.repository;

import com.amigoscode.JWTAmigos.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
