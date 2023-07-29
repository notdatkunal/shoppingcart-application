package com.shoppingcart.shoppingcartapplication.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private final String name;
    @Column(unique = true,nullable = false)
    private final String email;
    @Column(nullable = false)
    private final String password;
    @Column(unique = true,nullable = false)
    private final Long mobilenumber;

    @OneToMany
    private List<Merchant> merchants = new ArrayList<>();

}

