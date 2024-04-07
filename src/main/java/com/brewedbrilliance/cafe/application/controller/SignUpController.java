package com.brewedbrilliance.cafe.application.controller;

import com.brewedbrilliance.cafe.application.Entity.Signup;
import com.brewedbrilliance.cafe.application.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/brewedbrilliance")
public class SignUpController {
    @Autowired
    private SignupService signupService;
    @PostMapping("/signup")
    public ResponseEntity <?> createUser(@RequestBody Signup userRequest){
        return signupService.createUser(userRequest);
    }
}
