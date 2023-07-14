package com.example.springdatabasicdemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "planes")
public class Plane extends Vehicle{
    private String airline;
    private Integer passenger_capacity;

    protected Plane() {
    }

    public Plane(String fuel_type, String model, BigDecimal price, String type, String airline, Integer passenger_capacity) {
        super(fuel_type, model, price, type);
        this.airline = airline;
        this.passenger_capacity = passenger_capacity;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Integer getPassenger_capacity() {
        return passenger_capacity;
    }

    public void setPassenger_capacity(Integer passenger_capacity) {
        this.passenger_capacity = passenger_capacity;
    }
}
