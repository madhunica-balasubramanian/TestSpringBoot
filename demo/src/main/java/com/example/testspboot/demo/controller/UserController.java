package com.example.testspboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testspboot.demo.model.User;
import com.example.testspboot.demo.repository.UserRepository;


    // UserController.java
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired private UserRepository userRepo;

    @GetMapping("/hello")
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
