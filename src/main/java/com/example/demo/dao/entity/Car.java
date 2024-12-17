package com.example.demo.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVoiture;
    String model;
    String color;
    String matricul;
    double price;

    public Car(Long idVoiture, String model, String color, String matricul, double price) {
        this.idVoiture = idVoiture;
        this.model = model;
        this.color = color;
        this.matricul = matricul;
        this.price = price;
    }

    public Car() {

    }

    public Long getIdVoiture() {
        return idVoiture;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMatricul() {
        return matricul;
    }

    public double getPrice() {
        return price;
    }

    public void setIdAvion(Long idAvion) {
        this.idVoiture = idVoiture;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricul(String matricul) {
        this.matricul = matricul;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}