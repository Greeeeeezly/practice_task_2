package com.example.springdatabasicdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "trucks")
public class Truck extends Vehicle{
    private Double load_capacity;

    protected Truck() {
    }

    public Truck(String fuel_type, String model, BigDecimal price, String type, Double load_capacity) {
        super(fuel_type, model, price, type);
        this.load_capacity = load_capacity;
    }

    public Double getLoad_capacity() {
        return load_capacity;
    }

    public void setLoad_capacity(Double load_capacity) {
        this.load_capacity = load_capacity;
    }
}
