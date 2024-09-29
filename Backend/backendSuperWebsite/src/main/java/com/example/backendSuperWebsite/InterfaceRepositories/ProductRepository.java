package com.example.backendSuperWebsite.InterfaceRepositories;

import com.example.backendSuperWebsite.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}