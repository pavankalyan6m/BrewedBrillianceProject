package com.brewedbrilliance.cafe.application.service;

import com.brewedbrilliance.cafe.application.Entity.CafeItems;
import com.brewedbrilliance.cafe.application.repository.CafeItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeItemsService {

    @Autowired
    private CafeItemsRepository cafeItemsRepository;
    public ResponseEntity<String> addNewItem(CafeItems item) {

        CafeItems items = new CafeItems();
        items.setName(item.getName());
        items.setDescription(item.getDescription());
        item.setPrice(item.getPrice());
        item.setSize(item.getSize());

        return ResponseEntity.ok().body("New item added successfully to our Menu....");

    }

    public List<CafeItems> getAllItems()
    {
         return cafeItemsRepository.findAll();
    }
}
