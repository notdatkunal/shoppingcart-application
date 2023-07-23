package com.shoppingcart.shoppingcartapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/merchants")
    public String getMerchants(){
        // return the list of merchants that are approved by admin
        return "hello";
    }
}
