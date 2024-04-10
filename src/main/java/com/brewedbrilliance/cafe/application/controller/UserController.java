package com.brewedbrilliance.cafe.application.controller;

import com.brewedbrilliance.cafe.application.Entity.User;
import com.brewedbrilliance.cafe.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/brewedbrilliance")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/signup")
    public ResponseEntity <?> createUser(@RequestBody User userRequest){
        return userService.createUser(userRequest);
    }
    @GetMapping("/login")
    public ResponseEntity<String> getUserDetails( @RequestParam("email") String email, @RequestParam("password")  String password)
    {
        return userService.getUser(email,password);
    }
}

