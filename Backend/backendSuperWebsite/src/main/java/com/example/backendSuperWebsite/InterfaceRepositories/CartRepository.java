package com.example.backendSuperWebsite.InterfaceRepositories;

import com.example.backendSuperWebsite.Entities.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {}