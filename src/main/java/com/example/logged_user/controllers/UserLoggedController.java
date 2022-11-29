package com.example.logged_user.controllers;

import com.example.logged_user.models.UserLogged;
import com.example.logged_user.repositories.UserLoggedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/userlogged")
public class UserLoggedController {

    @Autowired
    UserLoggedRepository repository;

    @PostMapping(value = "/create")
    public UserLogged postCharity(@RequestBody UserLogged u) {
        UserLogged _u = repository.save(new UserLogged(u.getId(), u.getName(), u.getNameCEO(), u.getAddress(), u.getPhone(), u.getEmail(), u.getPassword(), u.getClientId()));
        return _u;
    }

    @GetMapping("getuser")
    public List<UserLogged> getUserLogged() {
        System.out.println("Get single user lgoged...");

        List<UserLogged> u = new ArrayList<>();
        repository.findAll().forEach(u::add);

        return u;
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUserLogged() {
        System.out.println("Delete User...");

        repository.deleteAll();

        return new ResponseEntity<>("User Logged have been deleted!", HttpStatus.OK);
    }



}
