package com.day4.day4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day4.day4.model.Product;
import com.day4.day4.repository.ProductRepo;
import com.day4.day4.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService p;
    @Autowired
    ProductRepo obj;
    @PostMapping(path = "/api")
    public Product savedata(@RequestBody Product me)
    {
            return p.saveProduct(me);
    }
    @GetMapping("/api/product")
    public List<Product> getProduct()
    {
        return obj.findAll();
    }
    @GetMapping("/api/product/{productId}")
    public Optional<Product> retproduct(@PathVariable int pId)
    {
        
        return obj.findById(pId);
    }
}
