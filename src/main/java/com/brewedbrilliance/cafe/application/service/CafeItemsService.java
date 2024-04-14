package com.brewedbrilliance.cafe.application.service;

import com.brewedbrilliance.cafe.application.Entity.CafeItems;
import com.brewedbrilliance.cafe.application.repository.CafeItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CafeItemsService {

    @Autowired
    private CafeItemsRepository cafeItemsRepository;
    public ResponseEntity<String> addNewItem(CafeItems item) {

        CafeItems items = new CafeItems();
        items.setName(item.getName());
        items.setDescription(item.getDescription());
        item.setPrice(item.getPrice());

        cafeItemsRepository.save(item);

        return ResponseEntity.ok().body("New item added successfully to our Menu....");

    }

    public List<CafeItems> getAllItems()
    {
        System.out.println("Menu: "+cafeItemsRepository.findAll());
         return cafeItemsRepository.findAll();
    }

    public ResponseEntity<String> updateItems(int itemId, CafeItems newItem) {
        // Retrieve the existing item from the repository
        Optional<CafeItems> optionalItem = cafeItemsRepository.findById(itemId);

        // Check if the item exists
        if (optionalItem.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Item not found");
        }

        // Update the item's details
        CafeItems existingItem = optionalItem.get();
        existingItem.setName(newItem.getName());
        existingItem.setDescription(newItem.getDescription());
        existingItem.setPrice(newItem.getPrice());

        // Save the updated item
        cafeItemsRepository.save(existingItem);

        return ResponseEntity.ok().body("Item updated successfully");
    }


}
