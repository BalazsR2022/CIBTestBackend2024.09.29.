package com.example.backendSuperWebsite.InterfaceRepositories;

import com.example.backendSuperWebsite.Entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {}
