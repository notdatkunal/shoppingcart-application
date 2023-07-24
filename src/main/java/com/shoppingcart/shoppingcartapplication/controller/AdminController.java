package com.shoppingcart.shoppingcartapplication.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/merchants")
    public String getMerchants(){
        // return the list of merchants that are approved by admin
        return "hello";
    }

    @PutMapping("/merchants/{Id}")
    public String deactivateMerchants(@PathVariable Integer id){
        // return the list of merchants that are approved by admin
        return "merchant deactivated";
    }

}
