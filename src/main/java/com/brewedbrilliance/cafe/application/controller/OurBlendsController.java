package com.brewedbrilliance.cafe.application.controller;

import com.brewedbrilliance.cafe.application.Entity.OurBlendsItems;
import com.brewedbrilliance.cafe.application.service.OurBlendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ourblends")
public class OurBlendsController {

    @Autowired
    private OurBlendsService ourBlendsService;

    @PostMapping("/add/item")
    public ResponseEntity<String> addBlendsItem(@RequestBody OurBlendsItems item) {
        return ourBlendsService.addNewBlend(item);
    }

    @GetMapping("/get/all")
    public List<OurBlendsItems> getAllTheBlendsItems() {
        return ourBlendsService.getAllBlends();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateBlendItem(@PathVariable int id, @RequestBody OurBlendsItems newBlend) {
        return ourBlendsService.updateBlend(id, newBlend);
    }
}