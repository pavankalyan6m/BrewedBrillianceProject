package com.brewedbrilliance.cafe.application.service;

import com.brewedbrilliance.cafe.application.Entity.Coffee;
import com.brewedbrilliance.cafe.application.repository.CoffeeRepository;
import com.brewedbrilliance.cafe.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CoffeeDetailsService {

    @Autowired
    private CoffeeRepository coffeeRepository;

    public ResponseEntity<?> getcoffeeDetails(@RequestBody Coffee coffeeRequest){
        Coffee coffee = new Coffee();
        coffee.setCoffeeName(coffeeRequest.getCoffeeName());
        coffee.setPrice(coffeeRequest.getPrice());
        coffee.setSize(coffee.getSize());
        coffeeRepository.save(coffee);
        return ResponseEntity.ok().body("Order Saved Successfully...");
    }

}
