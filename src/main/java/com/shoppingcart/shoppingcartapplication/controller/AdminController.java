package com.shoppingcart.shoppingcartapplication.controller;

import com.shoppingcart.shoppingcartapplication.dto.Admin;
import com.shoppingcart.shoppingcartapplication.repository.AdminRepository;
import com.shoppingcart.shoppingcartapplication.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @GetMapping
    public void admin(){}
    @Autowired
    private  AdminRepository adminRepository;
    @PostMapping
    public boolean saveAdmin(@RequestBody Admin admin){
        // this will save admin
        // this is to create new admin account

        System.out.println(adminRepository.save(admin));
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
