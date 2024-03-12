package com.scaler.cartservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
public class Cart {
    private int id;
    private int userId;
    private Date date;
    private List<Product> products;




}

