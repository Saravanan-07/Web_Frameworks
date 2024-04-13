package com.example.day5cw1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day5cw1.model.Product;
import com.example.day5cw1.service.ProductService;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ProductController {
    public ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }
    @GetMapping("/api/products")
     public ResponseEntity<List<Product>> getMethodName() {

          List<Product> products = productService.getAllProducts();
          if (products.isEmpty()) {
               return new ResponseEntity<>(products, HttpStatus.NOT_FOUND);

          } else {

               return new ResponseEntity<>(products, HttpStatus.CREATED);
          }
     }
     @GetMapping("/api/products/{productId}")
     public ResponseEntity<Optional<Product>> SearchMedicine(@PathVariable int productId) {
          Optional<Product> search = productService.getRequiredProduct(productId);
          if (search.isPresent()) {

               return new ResponseEntity<>(search, HttpStatus.OK);
          } else {
               return new ResponseEntity<>(search, HttpStatus.NOT_FOUND);
          }

     }
    @PostMapping("/api/postproduct")
    public ResponseEntity<Product> postMethodName(@RequestBody Product product) {
        if(productService.saveProduct(product) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/api/putproduct/{productId}")
    public ResponseEntity<Product> putMethodName(@PathVariable("productId") int id, @RequestBody Product product) {
        if(productService.updateDetails(id,product) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("api/deleteproduct/{productId}")
    public ResponseEntity<Product> delete(@PathVariable("productId") int id,@RequestBody Product product)
    {
        if(productService.deleteProduct(id) == true)
        {
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
}
