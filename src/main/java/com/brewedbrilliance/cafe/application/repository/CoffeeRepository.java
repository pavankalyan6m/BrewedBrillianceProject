package com.brewedbrilliance.cafe.application.repository;

import com.brewedbrilliance.cafe.application.Entity.Coffee;
import com.brewedbrilliance.cafe.application.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;

public interface CoffeeRepository extends JpaRepository<Coffee, Integer> {

    Coffee coffeeDetails(@RequestBody Coffee coffeeRequest);
}
