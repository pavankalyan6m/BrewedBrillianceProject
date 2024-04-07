package com.brewedbrilliance.cafe.application.service;

import com.brewedbrilliance.cafe.application.Entity.SignupUser;
import com.brewedbrilliance.cafe.application.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SignupService {

    @Autowired
    private SignupRepository signupRepository;

    public ResponseEntity<?> createUser(@RequestBody SignupUser userRequest){
        SignupUser existingUser = signupRepository.findByEmail(userRequest.getEmail());
        if(existingUser!= null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User already exists");
        }
        SignupUser newUser = new SignupUser();
        newUser.setEmail(userRequest.getEmail());
        newUser.setFirstName(userRequest.getFirstName());
        newUser.setPassword(userRequest.getPassword());
        newUser.setLastName(userRequest.getLastName());
        signupRepository.save(newUser);
        return ResponseEntity.ok().body("User Created Successsfully");
    }


}
