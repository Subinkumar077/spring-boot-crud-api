package com.example.ecom.repository;

import com.example.ecom.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Integer is the primary key type JpaRepo -> consists of multiple methods that makes the code easier.
@Repository
public interface ProductRepo extends JpaRepository <Product, Integer>{

}
