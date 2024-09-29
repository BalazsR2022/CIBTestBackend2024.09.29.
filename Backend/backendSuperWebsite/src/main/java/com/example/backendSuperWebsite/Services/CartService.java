package com.example.backendSuperWebsite.Services;

import com.example.backendSuperWebsite.Entities.Cart;
import com.example.backendSuperWebsite.InterfaceRepositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public void deleteCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }

    public void updateCart(Cart cart) {
        cartRepository.save(cart);
    }
}
