package com.shoppingcart.shoppingcartapplication.dto;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Customer {
    @OneToOne
    private final Cart cart = new Cart(this);
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private final String name;
    @Column(unique = true)
    private final String email;
    @Column(nullable = false)
    private final String password;
    @Column(unique = true)
    private final Long mobilenumber;
    @Column(name = "customer_status",nullable = false)
    private Boolean status = true;
    // if kept true then user is active
    



}

