package com.day4.day4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day4.day4.model.Product;
import com.day4.day4.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repository;
    public Product saveProduct(Product p)
    {
        return repository.save(p);
    }
}