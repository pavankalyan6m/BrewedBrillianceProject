package com.brewedbrilliance.cafe.application.repository;

import com.brewedbrilliance.cafe.application.Entity.OurBlendsItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OurBlendsRepository extends JpaRepository<OurBlendsItems,Integer> {
}
