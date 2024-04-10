package com.brewedbrilliance.cafe.application.controller;

import com.brewedbrilliance.cafe.application.Entity.Coffee;
import com.brewedbrilliance.cafe.application.service.CoffeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brewedbrilliance")
public class CoffeeDetails {

    @Autowired
    CoffeeDetailsService coffeedetailsservice;
    @PostMapping("/coffeedetails")
    public ResponseEntity <?> getcoffeeDetails(@RequestBody Coffee coffeeRequest){
        return coffeedetailsservice.getcoffeeDetails(coffeeRequest);
    }



}
