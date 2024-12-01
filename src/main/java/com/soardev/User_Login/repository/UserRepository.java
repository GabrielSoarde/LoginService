package com.soardev.User_Login.repository;


import com.soardev.User_Login.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User>findByEmail(String email);
    Optional<User>findByPassword(String password);
}
