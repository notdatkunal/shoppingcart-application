package com.shoppingcart.shoppingcartapplication.repository;

import com.shoppingcart.shoppingcartapplication.dto.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

	public Admin findByEmail(String email);

}
