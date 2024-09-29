package com.example.backendSuperWebsite.Services;

import com.example.backendSuperWebsite.Entities.Product;
import com.example.backendSuperWebsite.InterfaceRepositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

}
