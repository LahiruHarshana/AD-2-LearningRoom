package com.example.item_service.controller;

import com.example.item_service.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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


    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/get")
    public String getItem() {
        return "Item Details";
    }

    @PostMapping("/add")
    public String addItem(@RequestBody CustomerDTO customerDTO) {
        return customerDTO.toString();
    }

    @GetMapping("/getCus")
    public CustomerDTO getCus() {
        return restTemplate.getForObject("http://CUSTOMER-SERVICE/customer/getItems", CustomerDTO.class);
    }

}
