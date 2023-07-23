package com.shoppingcart.shoppingcartapplication.repository;

import com.shoppingcart.shoppingcartapplication.dto.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant,Integer> {
}
