package com.shoppingcart.shoppingcartapplication.service;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    public ResponseEntity<String> getCustomers() {
        return ResponseEntity.ok("this is customer");
    }
}
