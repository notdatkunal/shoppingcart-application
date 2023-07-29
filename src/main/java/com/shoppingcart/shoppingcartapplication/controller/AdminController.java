package com.shoppingcart.shoppingcartapplication.controller;


import com.shoppingcart.shoppingcartapplication.dto.Merchant;
import com.shoppingcart.shoppingcartapplication.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private final AdminService adminService;



    

    

    @GetMapping("/merchants")
    public ResponseEntity<List<Merchant>> getMerchants(){
        
        return adminService.getMerchants();
    }

    @PutMapping("merchants/{id}")
    public ResponseEntity<Merchant> activateMerchants(@PathVariable Integer id){
        
        
        return adminService.activateMerchants(id);
    }
    
    @DeleteMapping("merchants/{id}")
    public ResponseEntity<Merchant> deleteMerchants(@PathVariable Integer id) {
    	return adminService.deleteMerchants(id);
    }

}
