package com.example.d11onetooneuni.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.d11onetooneuni.model.Address;

public interface AddressRepo extends JpaRepository<Address,Long> {
     
}