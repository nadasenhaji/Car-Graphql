package com.example.demo.dto;


public class CarDTO {
    private String model;
    private String color;
    private String matricul;
    private double price; // Changed to float as per GraphQL schema

    // Parameterized constructor for convenience
    public CarDTO(String model, String color, String matricul, double price) {
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricul() {
        return matricul;
    }

    public void setMatricul(String matricul) {
        this.matricul = matricul;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}