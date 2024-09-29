package com.example.backendSuperWebsite.Services;

import com.example.backendSuperWebsite.Entities.CartItem;
import com.example.backendSuperWebsite.InterfaceRepositories.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    public void deleteCartItem(Long cartItemId) {
        cartItemRepository.deleteById(cartItemId);
    }

    public void updateCartItem(CartItem cartItem) {
        cartItemRepository.save(cartItem);
    }
}
