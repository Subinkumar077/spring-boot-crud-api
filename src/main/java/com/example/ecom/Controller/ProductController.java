
package com.example.ecom.Controller;

import com.example.ecom.Model.Product;
import com.example.ecom.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    // Get all products
    @GetMapping("/products")
    public List<Product> getProduct() {
        return service.getProducts();
    }

    // Get product by ID
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    // Add a new product
    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod) {
        service.addProducts(prod);
    }

    // Update an existing product
    @PutMapping("/products")
    public void updateProducts(@RequestBody Product prod) {
        service.updateProducts(prod);
    }

    // Delete a product by ID
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }
}
