package com.example.backendSuperWebsite.Controllers;

import com.example.backendSuperWebsite.Entities.CartItem;
import com.example.backendSuperWebsite.Services.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/cartItems")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @GetMapping
    public List<CartItem> getAllCartItems() {
        return cartItemService.getAllCartItems();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCartItem(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<CartItem> updateCartItem(@RequestBody CartItem cartItem) {
        cartItemService.updateCartItem(cartItem);
        return ResponseEntity.ok(cartItem);
    }
}
