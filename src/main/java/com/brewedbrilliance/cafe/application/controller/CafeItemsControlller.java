package com.brewedbrilliance.cafe.application.controller;

import com.brewedbrilliance.cafe.application.Entity.CafeItems;
import com.brewedbrilliance.cafe.application.service.CafeItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class CafeItemsControlller {

    @Autowired
private CafeItemsService cafeItemsService;

    @PostMapping("/item")
    public ResponseEntity<String> addItem(@RequestBody CafeItems item)
    {
        return cafeItemsService.addNewItem(item);
    }

    @GetMapping("/get/all")
    public List<CafeItems> getAllTheMenuItems()
    {
        return cafeItemsService.getAllItems();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateItem(@PathVariable int id, @RequestBody CafeItems newItem){
        return cafeItemsService.updateItems(id, newItem);
    }

}
