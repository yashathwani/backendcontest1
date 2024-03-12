package com.scaler.cartservice.services;

import com.scaler.cartservice.dtos.FakeStoreCartDto;
import com.scaler.cartservice.models.Cart;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface CartService {
    FakeStoreCartDto[] getCarts();
    Cart getCart(int id);

    FakeStoreCartDto[] getCartsDate(Date startDate, Date endDate);

    FakeStoreCartDto[] getCartsByUser( int id);

        public Cart addCart( Cart cart);
        public Cart updateCart(int id,  Cart cart);
        void deleteCart( int id);

}
