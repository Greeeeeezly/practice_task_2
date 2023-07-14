package com.example.springdatabasicdemo.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Table(name = "vehicles")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id", precision = 20)
    private Long id;
    private String fuel_type;
    private String model;
    @Column(precision = 19, scale = 2)
    private BigDecimal price;
    private String type;

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", fuel_type='" + fuel_type + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    protected Vehicle() {
    }

    public Vehicle(String fuel_type, String model, BigDecimal price, String type) {
        this.fuel_type = fuel_type;
        this.model = model;
        this.price = price;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
