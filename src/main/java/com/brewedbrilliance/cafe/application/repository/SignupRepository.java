package com.brewedbrilliance.cafe.application.repository;

import com.brewedbrilliance.cafe.application.Entity.Signup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupRepository extends JpaRepository <Signup, Integer> {

    Signup findByEmail(String email);
}
