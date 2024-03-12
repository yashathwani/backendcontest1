package com.scaler.cartservice.services;

import com.scaler.cartservice.dtos.FakeStoreCartDto;
import com.scaler.cartservice.models.Cart;
import com.scaler.cartservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@Service
public class FakeStoreCartService implements CartService{
    RestTemplate restTemplate = new RestTemplate();
    String url="https://fakestoreapi.com/";
    @Override
    public  FakeStoreCartDto[] getCarts() {
        FakeStoreCartDto[] response= restTemplate.getForObject(url+"carts",FakeStoreCartDto[].class);
        return response;
    }
   public Cart getCart(int id) {
        Cart response= restTemplate.getForObject(url+"carts/"+id,Cart.class);
        return response;

    }

    @Override
    public FakeStoreCartDto[] getCartsDate(Date startDate, Date endDate)
    {
        return null;


    }

    @Override
    public FakeStoreCartDto[] getCartsByUser(int id) {

        FakeStoreCartDto[] response= restTemplate.getForObject(url+"carts/user/"+id,FakeStoreCartDto[].class);
        return response;

    }


@Override
    public Cart addCart(Cart cart) {
        return null;

    }

    @Override
    public Cart updateCart(int id, Cart cart) {
        return null;
    }

    @Override
    public void deleteCart(int id) {
     
    }




}
