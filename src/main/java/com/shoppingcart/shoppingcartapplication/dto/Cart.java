package com.shoppingcart.shoppingcartapplication.dto;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double totalPrice;
    @OneToOne
    private Customer customer;
    @OneToMany
    private List<Item> items;






}