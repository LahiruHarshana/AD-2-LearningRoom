package com.example.item_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : L.H.J
 * @File: ItemController
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-31, Friday
 **/

@RestController
@RequestMapping("/item")
@CrossOrigin(origins = "*")
public class ItemController {

    @GetMapping("/get")
    public String getItem() {
        return "Item Details";
    }
}
