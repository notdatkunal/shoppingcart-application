package com.shoppingcart.shoppingcartapplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping
    public ResponseEntity<String> customer(){
        return ResponseEntity.ok("this is customer");
    }
}
