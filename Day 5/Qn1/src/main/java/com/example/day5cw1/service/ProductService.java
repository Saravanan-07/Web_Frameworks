package com.example.day5cw1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.Product;
import com.example.day5cw1.repository.ProductRepo;

@Service
public class ProductService {
    public ProductRepo productRepo;
    public ProductService(ProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public List<Product> getAllProducts() {
        return productRepo.findAll();
   }
   public Optional<Product> getRequiredProduct(int productId) {
    return productRepo.findById(productId);
}
    public boolean saveProduct(Product product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Product product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public Product getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
