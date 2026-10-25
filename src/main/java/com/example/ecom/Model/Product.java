package com.example.ecom.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id //to make primary key
    private int prodId;
    private String prodName;
    private int prodPrice;

    public Product() {
    }

    public Product(int prodId, String prodName, int prodPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }
}
