package com.shoppingcart.shoppingcartapplication.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.ArrayList;
import java.util.List;



@Entity
@Data
@RequiredArgsConstructor
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private final String name;
    @Column(unique = true)
    private final String email;
    private final String password;
    @Column(unique = true,nullable = false)
    private final Long mobilenumber;
    @Column(name="merchant_status",nullable = false)
    private Boolean status = false;
    @OneToMany
    private List<Product>Products = new ArrayList<>();
    @ManyToOne
    private Admin admin;


}
