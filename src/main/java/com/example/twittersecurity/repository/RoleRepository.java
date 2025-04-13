package com.example.twittersecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.twittersecurity.entities.Role;

public interface RoleRepository extends JpaRepository <Role, Long>{

    Role findByName(String name);
    
}
