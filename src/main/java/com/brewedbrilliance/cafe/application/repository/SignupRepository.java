package com.brewedbrilliance.cafe.application.repository;

import com.brewedbrilliance.cafe.application.Entity.SignupUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupRepository extends JpaRepository <SignupUser, Integer> {

    SignupUser findByEmail(String email);
}
