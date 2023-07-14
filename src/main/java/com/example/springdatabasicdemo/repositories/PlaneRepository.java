package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, Integer> {
}
