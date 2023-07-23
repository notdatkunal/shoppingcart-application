package com.shoppingcart.shoppingcartapplication.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Entity
@Data
@NoArgsConstructor
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private long mobilenumber;
    private String status;
    @OneToMany
    private List<Product>Products;
    @ManyToOne
    private Admin admin;


}
