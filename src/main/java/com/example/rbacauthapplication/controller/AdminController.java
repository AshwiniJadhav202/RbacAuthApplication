package com.example.rbacauthapplication.controller;

import com.example.rbacauthapplication.entity.User;
import com.example.rbacauthapplication.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin("*")
public class AdminController {

    @Autowired
    private AuthService authService;

    @GetMapping("/users")
    public List<User> getUsers(){

        return authService.getAllUsers();

    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id){

        return authService.deleteUser(id);

    }

    @GetMapping("/search/{email}")
    public List<User> searchUsers(@PathVariable String email){

        return authService.searchUsers(email);

    }

}