package com.shoppingcart.shoppingcartapplication.repository;

import com.shoppingcart.shoppingcartapplication.dto.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
}
