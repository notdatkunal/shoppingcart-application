package com.shoppingcart.shoppingcartapplication.controller;

import com.shoppingcart.shoppingcartapplication.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;
    @GetMapping
    public String merchant(){return "this is merchant";}
}
