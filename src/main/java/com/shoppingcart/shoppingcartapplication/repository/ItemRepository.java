package com.shoppingcart.shoppingcartapplication.repository;

import com.shoppingcart.shoppingcartapplication.dto.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
