package com.example.rbacauthapplication.service;

import com.example.rbacauthapplication.entity.User;
import com.example.rbacauthapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public String register(User user) {

        userRepository.save(user);

        return "User Registered Successfully";
    }

    public String login(String email,String password){

        User user=userRepository.findByEmail(email);

        if(user==null){
            return "User not found";
        }

        if(!user.getPassword().equals(password)){
            return "Invalid password";
        }

        return "Login Successful";
    }

    public User getProfile(String email){

        return userRepository.findByEmail(email);

    }

    public String updateUser(Long id,User user){

        User existing=userRepository.findById(id).orElse(null);

        if(existing==null){
            return "User not found";
        }

        existing.setName(user.getName());
        existing.setEmail(user.getEmail());

        userRepository.save(existing);

        return "Profile Updated Successfully";

    }

    public String deleteUser(Long id){

        userRepository.deleteById(id);

        return "User Deleted";

    }

    public List<User> getAllUsers(){

        return userRepository.findAll();

    }

    public List<User> searchUsers(String email){

        return userRepository.findByEmailContaining(email);

    }

}