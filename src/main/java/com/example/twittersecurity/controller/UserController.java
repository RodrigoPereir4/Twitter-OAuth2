package com.example.twittersecurity.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.twittersecurity.dto.CreateUserDto;
import com.example.twittersecurity.entities.Role;
import com.example.twittersecurity.entities.User;
import com.example.twittersecurity.repository.RoleRepository;
import com.example.twittersecurity.repository.UserRepository;

import jakarta.transaction.Transactional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/user")
    @Transactional
    public ResponseEntity<Void> newUser(@RequestBody CreateUserDto dto) {

        var basicRole = roleRepository.findByName(Role.Values.BASIC.name());

        var user = userRepository.findByUsername(dto.username());
        if (user.isPresent()) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);
        }

        var userCreate = new User();

        userCreate.setUsername(dto.username());
        userCreate.setPassword(passwordEncoder.encode(dto.password()));
        userCreate.setRoles(Set.of(basicRole));

        userRepository.save(userCreate);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/list")
    @PreAuthorize("hasAuthority('SCOPE_admin')")
    public ResponseEntity<List<User>> listUser(){
        var users = userRepository.findAll();
        return ResponseEntity.ok(users);
    } 
}
