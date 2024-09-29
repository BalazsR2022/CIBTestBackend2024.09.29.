package com.example.backendSuperWebsite.Controllers;

import com.example.backendSuperWebsite.Entities.Cart;
import com.example.backendSuperWebsite.Services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCart(@PathVariable Long id) {
        cartService.deleteCart(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Cart> updateCart(@RequestBody Cart cart) {
        cartService.updateCart(cart);
        return ResponseEntity.ok(cart);
    }
}

