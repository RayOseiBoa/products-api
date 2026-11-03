package uk.ac.westminster.products_api;

import java.util.Collection;

public class Product {
    private Long id;

    public String getName() {
        return name;
    }

    public Product(String name) {
        this.name = name;
    }

    private String name;

    public double getPrice() {
        return price;
    }

    public Product(double price) {
        this.price = price;
    }

    private double price;

    public String getSummary() {
        return getName() + "-£" + getPrice();
    }
}

    public class DigitalProduct extends Product {
        private String downloadUrl;

        @Override
        public String getSummary(){
            return "Digital: " + getName();
        }
        public String getDownloadUrl(){
            return downloadUrl;
        }
    }
}