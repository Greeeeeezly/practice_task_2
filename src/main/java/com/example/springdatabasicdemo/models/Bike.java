package com.example.springdatabasicdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "bikes")
public class Bike extends Vehicle{

    protected Bike() {
    }

    public Bike(String fuel_type, String model, BigDecimal price, String type) {
        super(fuel_type, model, price, type);
    }

}
