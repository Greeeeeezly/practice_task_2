package com.example.springdatabasicdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "cars")
public class Car extends Vehicle{
    private String seats;

    public Car(String fuel_type, String model, BigDecimal price, String type, String seats) {
        super(fuel_type, model, price, type);
        this.seats = seats;
    }

    protected Car() {
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}
