package com.shoppingcart.shoppingcartapplication.controller;

import com.shoppingcart.shoppingcartapplication.dto.Admin;
import com.shoppingcart.shoppingcartapplication.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public void admin(){}

    @PostMapping
    public boolean saveAdmin(@RequestBody Admin admin){
        // this will save admin
        // this is to create new admin account


        return true;
        //return new ResponseEntity();
    }

    @GetMapping("/merchants")
    public String getMerchants(){
        // return the list of merchants that are not approved by admin
        return "hello";
    }

    @GetMapping("merchant/{id}")
    public String deactivateMerchants(@PathVariable Integer id){
        // return the list of merchants that are approved by admin
        System.out.println(id);
        return "merchant deactivated";
    }

}
