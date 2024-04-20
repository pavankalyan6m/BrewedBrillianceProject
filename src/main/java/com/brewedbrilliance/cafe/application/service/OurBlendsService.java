package com.brewedbrilliance.cafe.application.service;

import com.brewedbrilliance.cafe.application.Entity.OurBlendsItems;
import com.brewedbrilliance.cafe.application.repository.OurBlendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OurBlendsService {

    @Autowired
    private OurBlendsRepository ourBlendsRepository;

    public ResponseEntity<String> addNewBlend(OurBlendsItems blend) {
        try {
            ourBlendsRepository.save(blend);
            return ResponseEntity.ok("Blend added successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error adding blend: " + e.getMessage());
        }
    }

    public List<OurBlendsItems> getAllBlends() {
        return ourBlendsRepository.findAll();
    }

    public ResponseEntity<String> updateBlend(int id, OurBlendsItems newBlend) {
        Optional<OurBlendsItems> optionalBlend = ourBlendsRepository.findById(id);
        if (optionalBlend.isPresent()) {
            OurBlendsItems existingBlend = optionalBlend.get();
            existingBlend.setName(newBlend.getName());
            existingBlend.setDescription(newBlend.getDescription());
            existingBlend.setPrice(newBlend.getPrice());
            existingBlend.setImagePath(newBlend.getImagePath());
            ourBlendsRepository.save(existingBlend);
            return ResponseEntity.ok("Blend updated successfully.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}