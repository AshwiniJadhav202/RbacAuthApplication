package com.example.rbacauthapplication.controller;

import com.example.rbacauthapplication.entity.User;
import com.example.rbacauthapplication.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private AuthService authService;

    @GetMapping("/profile/{email}")
    public User getProfile(@PathVariable String email){

        return authService.getProfile(email);

    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable Long id,@RequestBody User user){

        return authService.updateUser(id,user);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){

        return authService.deleteUser(id);

    }

}