package com.example.productservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

    @Entity
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int locNo;
        private String name;
        private String description;
        private Double price;
        private Boolean available;

        // Default constructor
        public Product() {
        }

        // Parameterized constructor
        public Product(String name, String description, Double price, Boolean available) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.available = available;
        }


        public Product(int orderId, String name, String description, Double price, Boolean available) {
            this.locNo = orderId;
            this.name = name;
            this.description = description;
            this.price = price;
            this.available = available;
        }

        // Getters and Setters
        public int getId() {
            return locNo;
        }

    public void setId(int id) {
        this.locNo = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "Product{" +
                "locNo=" + locNo +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
