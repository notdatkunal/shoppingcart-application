package com.shoppingcart.shoppingcartapplication.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Admin {

    @Id
    private int id;

    private String email;
    private String password;

    @OneToMany
    private List<Merchant> merchants;

}

