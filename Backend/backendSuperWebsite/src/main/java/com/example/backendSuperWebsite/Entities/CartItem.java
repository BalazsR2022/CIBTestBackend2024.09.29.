package com.example.backendSuperWebsite.Entities;

import jakarta.persistence.*;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    private String category;

    @Column(nullable = false)
    private int quantity;

    private int price;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;


    public CartItem() {
    }


    public CartItem(String productName, String category, int quantity, int price, Cart cart) {
        this.productName = productName;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.cart = cart;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }


    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", cart=" + (cart != null ? cart.getId() : null) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartItem cartItem)) return false;
        return id != null && id.equals(cartItem.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
