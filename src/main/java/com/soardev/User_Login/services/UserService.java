package com.soardev.User_Login.services;

import com.soardev.User_Login.entities.User;
import com.soardev.User_Login.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public String register(User user){
        if (userRepository.findByEmail(user.getEmail()).isPresent()){
            return "Email ja cadastrado!";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "Email cadastrado com sucesso!";
    }

    public boolean login(String email, String password){
        Optional<User> user = userRepository.findByEmail(email);
        return user.map(value -> passwordEncoder.matches(password, value.getPassword())).orElse(false);
    }

}
