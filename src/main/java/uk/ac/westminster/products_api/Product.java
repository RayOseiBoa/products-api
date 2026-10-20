package uk.ac.westminster.products_api;

import java.util.Collection;

public class Product {

    private Long id;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String name;
    private double price;

    public Product() {}

    public Product (Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
}
   public Long getId() { return id;}
    // public String getName() { return name;}
    public double getPrice() { return price;}

    public Collection<Object> getName() {
    }
}