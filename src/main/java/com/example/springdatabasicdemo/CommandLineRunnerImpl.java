package com.example.springdatabasicdemo;
import com.example.springdatabasicdemo.models.Bike;
import com.example.springdatabasicdemo.models.Car;
import com.example.springdatabasicdemo.models.Plane;
import com.example.springdatabasicdemo.models.Truck;
import com.example.springdatabasicdemo.repositories.BikeRepository;
import com.example.springdatabasicdemo.repositories.CarRepository;
import com.example.springdatabasicdemo.repositories.PlaneRepository;
import com.example.springdatabasicdemo.repositories.TruckRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    private final BikeRepository bikeRepository;
    private final CarRepository carRepository;
    private final PlaneRepository planeRepository;
    private final TruckRepository truckRepository;

    public CommandLineRunnerImpl(BikeRepository bikeRepository, CarRepository carRepository, PlaneRepository planeRepository, TruckRepository truckRepository) {
        this.bikeRepository = bikeRepository;
        this.carRepository = carRepository;
        this.planeRepository = planeRepository;
        this.truckRepository = truckRepository;
    }

    @Override
    public void run(String... args) {
        try {
            seedData();
            bikeRepository.findAll().forEach(System.out::println);
            carRepository.findAll().forEach(System.out::println);
            planeRepository.findAll().forEach(System.out::println);
            truckRepository.findAll().forEach(System.out::println);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void seedData() {
        bikeRepository.save(new Bike("gas", "Kawasaki Ninja", BigDecimal.valueOf(700000), "sport"));
        carRepository.save(new Car("gas", "VAZ 2112", BigDecimal.valueOf(150000), "sedan", "5"));
        planeRepository.save(new Plane("gas", "Boeing 737", BigDecimal.valueOf(333000000), "average", "Aeroflot", 333));
        truckRepository.save(new Truck("diesel", "Kamaz 2332", BigDecimal.valueOf(6000000), "heavy", 5000.00));
    }
}