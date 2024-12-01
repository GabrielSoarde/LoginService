package com.soardev.User_Login.controller;

import com.soardev.User_Login.entities.LoginRequest;
import com.soardev.User_Login.entities.User;
import com.soardev.User_Login.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        String message = userService.register(user);
        if(message.equals("Email já cadastrado!")){
            return ResponseEntity.badRequest().body(message);
        }
        return ResponseEntity.ok(message);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest){
        if(userService.login(loginRequest.getEmail(), loginRequest.getPassword())){
            return ResponseEntity.ok("Login realizado com sucesso!");
        }
        return ResponseEntity.badRequest().body("Senha ou email inválidos!");
    }
}
