package com.example.ecom.Service;

import com.example.ecom.Model.Product;
import com.example.ecom.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {

    @Autowired
    ProductRepo repo;

    /*List<Product> products =new ArrayList<>(Arrays.asList(
            new Product(101, "Car", 100000),
            new Product(102,"bike",120000),
            new Product(103, "bus",130000))) ;*/

    public List<Product> getProducts(){
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProducts(Product prod) {
        repo.save(prod);
    }

    public void updateProducts(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);

    }
}
