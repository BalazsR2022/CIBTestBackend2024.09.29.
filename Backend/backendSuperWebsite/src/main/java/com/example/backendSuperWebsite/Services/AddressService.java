package com.example.backendSuperWebsite.Services;

import com.example.backendSuperWebsite.Entities.Address;
import com.example.backendSuperWebsite.InterfaceRepositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public void deleteAddress(Long productId) {
        addressRepository.deleteById(productId);
    }

    public void updateAddress(Address address) {
        addressRepository.save(address);
    }
}