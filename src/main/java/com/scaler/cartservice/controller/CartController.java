package com.scaler.cartservice.controller;

import com.scaler.cartservice.dtos.FakeStoreCartDto;
import com.scaler.cartservice.services.CartService;
import org.springframework.web.bind.annotation.*;
import com.scaler.cartservice.models.Cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/carts")
    public FakeStoreCartDto[] getCarts()
    {
        return cartService.getCarts();
    }

    @GetMapping("/carts/{id}")
    public Cart getCart(@PathVariable int id)
    {
        return cartService.getCart(id);
    }
    @GetMapping("/carts")
    public FakeStoreCartDto[] getCartsDate(@RequestBody Date startDate, @RequestBody Date endDate)
    {
        return cartService.getCartsDate(startDate, endDate);
    }
    @GetMapping("/carts/user/{id}")
    public FakeStoreCartDto[] getCartsByUser(@PathVariable int id)
    {
        return cartService.getCartsByUser(id);
    }
    @PostMapping("/carts")
    public Cart addCart(@RequestBody Cart cart)
    {
        return new Cart();
    }
   @PatchMapping("/carts/{id}")
    public Cart updateCart(@PathVariable int id, @RequestBody Cart cart)
    {
        return new Cart();
    }
    @DeleteMapping("/carts/{id}")
    public void deleteCart(@PathVariable int id)
    {

    }





}
