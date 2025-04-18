package com.example.testspboot.demo.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testspboot.demo.model.User;

//import org.springframework.data.jpa.repository.JpaRepository;


    // UserRepository.java
@Repository
public interface UserRepository extends JpaRepository<User, Long> { }

