package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<Truck, Integer> {
}
