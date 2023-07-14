package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
