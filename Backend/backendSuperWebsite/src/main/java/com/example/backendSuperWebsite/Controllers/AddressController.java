package com.example.backendSuperWebsite.Controllers;

import com.example.backendSuperWebsite.Entities.Address;
import com.example.backendSuperWebsite.Services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Address> updateCart(@RequestBody Address address) {
        addressService.updateAddress(address);
        return ResponseEntity.ok(address);
    }
}

