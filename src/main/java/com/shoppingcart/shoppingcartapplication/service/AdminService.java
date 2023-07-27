package com.shoppingcart.shoppingcartapplication.service;

import com.shoppingcart.shoppingcartapplication.dto.Merchant;
import com.shoppingcart.shoppingcartapplication.repository.AdminRepository;
import com.shoppingcart.shoppingcartapplication.repository.MerchantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@AllArgsConstructor
public class AdminService {

    @Autowired
    private final AdminRepository adminRepository;

    @Autowired
    private final MerchantRepository merchantRepository;


    public ResponseEntity<List<Merchant>> getMerchants() {

        var merchants = merchantRepository.findAll();
        var reqests = new LinkedList<Merchant>();
        for (var merchant:
                merchants) {
            if(!merchant.getStatus()){
                reqests.add(merchant);
            }

        }
        return ResponseEntity.ok(reqests);
    }
}
