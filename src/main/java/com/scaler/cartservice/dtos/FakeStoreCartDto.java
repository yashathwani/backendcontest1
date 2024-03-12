package com.scaler.cartservice.dtos;

import com.scaler.cartservice.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FakeStoreCartDto {
    private int id;
    private int userId;
    private String date;
    private List<Product> products;

}
