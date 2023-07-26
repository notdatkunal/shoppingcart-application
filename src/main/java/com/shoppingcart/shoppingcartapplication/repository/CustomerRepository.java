package com.shoppingcart.shoppingcartapplication.repository;

import com.shoppingcart.shoppingcartapplication.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
