package com.brewedbrilliance.cafe.application.repository;

import com.brewedbrilliance.cafe.application.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {

    User findByEmail(String email);
}
