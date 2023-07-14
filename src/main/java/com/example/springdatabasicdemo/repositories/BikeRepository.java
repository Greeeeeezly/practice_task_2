package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Integer> {
}
