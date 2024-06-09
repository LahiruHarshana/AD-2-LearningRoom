package com.example.customer_service.controller;

import com.example.customer_service.dto.CustomerDTO;
import jakarta.ws.rs.POST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author : L.H.J
 * @File: CustomerController
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-31, Friday
 **/


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    public RestTemplate restTemplate;
    @GetMapping("/get")
    public String getCustomer() {
        return restTemplate.getForObject("http://ITEM-SERVICE/item/get", String.class);
    }
    @PostMapping("/add")
    public String addCustomer() {
        return restTemplate.postForObject("http://ITEM-SERVICE/item/add", new CustomerDTO("lahiru","Weligama","lahjiruHarshana","0718334554"), String.class);
    }
    @GetMapping("/getItems")
    public CustomerDTO getItems() {
        return new CustomerDTO("lahiru","Weligama","lahjiruHarshana","0718334554");
    }
    @PostMapping("/addItem")
    public CustomerDTO addItem(@RequestBody CustomerDTO customerDTO) {
        return restTemplate.postForObject("http://ITEM-SERVICE/item/add", customerDTO, CustomerDTO.class);
    }
}
