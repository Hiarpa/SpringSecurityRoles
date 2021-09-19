package com.amigoscode.JWTAmigos.repository;

import com.amigoscode.JWTAmigos.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
