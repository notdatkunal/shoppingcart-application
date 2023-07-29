package com.shoppingcart.shoppingcartapplication.dto;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double totalPrice = 0d;
    @OneToOne
    private final Customer customer;
    @OneToMany
    private List<Item> items = new ArrayList<>();






}
