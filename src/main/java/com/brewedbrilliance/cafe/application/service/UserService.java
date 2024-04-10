package com.brewedbrilliance.cafe.application.service;

import com.brewedbrilliance.cafe.application.Entity.User;
import com.brewedbrilliance.cafe.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<?> createUser(@RequestBody User userRequest){
        User existingUser = userRepository.findByEmail(userRequest.getEmail());
        if(existingUser!= null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User already exists!");
        }
        User newUser = new User();
        newUser.setEmail(userRequest.getEmail());
        newUser.setFirstName(userRequest.getFirstName());
        newUser.setPassword(userRequest.getPassword());
        newUser.setLastName(userRequest.getLastName());
        userRepository.save(newUser);
        return ResponseEntity.ok().body("User Created Successfully...");
    }


    public ResponseEntity<String> getUser(String email, String password) {
        // First, find the user by email
        System.out.println("Email: "+email);
        User user = userRepository.findByEmail(email);

        System.out.println("User: "+user);
        // Check if user exists and if the password matches
        if (user != null && user.getPassword().equals(password) && user.getEmail().equals(email)) {
            return ResponseEntity.ok("Logging in...");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
        }
    }
}
