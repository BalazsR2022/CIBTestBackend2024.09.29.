package com.example.backendSuperWebsite.Entities;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(nullable = false, unique = true)
    private String username;

    @ManyToOne
    @JoinColumn(name = "billing_address", nullable = false)
    private Address billingAddress;

    @ManyToOne
    @JoinColumn(name = "delivery_address", nullable = false)
    private Address deliveryAddress;


    public User(String lastName, String firstName, String username, Address billingAddress, Address deliveryAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.username = username;
        this.billingAddress = billingAddress;
        this.deliveryAddress = deliveryAddress;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", username='" + username + '\'' +
                ", billingAddress=" + (billingAddress != null ? billingAddress.getId() : null) +
                ", deliveryAddress=" + (deliveryAddress != null ? deliveryAddress.getId() : null) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id != null && id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
