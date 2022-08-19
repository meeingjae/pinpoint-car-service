package com.car;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/car")
public class CarController {

    CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<Car>> getCar() {

        return ResponseEntity.ok(carRepository.findAll());
    }
}
