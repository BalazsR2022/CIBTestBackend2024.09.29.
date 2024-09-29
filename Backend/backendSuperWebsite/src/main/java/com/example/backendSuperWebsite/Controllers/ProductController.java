package com.example.backendSuperWebsite.Controllers;

import com.example.backendSuperWebsite.Entities.Product;
import com.example.backendSuperWebsite.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllCartItems() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
        return ResponseEntity.ok(product);
    }
}
