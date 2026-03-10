package com.example.rbacauthapplication.repository;

import com.example.rbacauthapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    List<User> findByEmailContaining(String email);

}