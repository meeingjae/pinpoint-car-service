package com.car;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/car")
public class CarController {

    CarRepository carRepository;
    CarMemberRepository carMemberRepository;

    public CarController(CarRepository carRepository, CarMemberRepository carMemberRepository) {
        this.carRepository = carRepository;
        this.carMemberRepository = carMemberRepository;
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Car>> getCar() {

        return ResponseEntity.ok(carRepository.findAll());
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return ResponseEntity.ok(carRepository.save(car));
    }

    @GetMapping(value = "/member", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CarMember>> getMember() {

        return ResponseEntity.ok(carMemberRepository.findAll());
    }

    @PostMapping(value = "/member", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CarMember> createMember(@RequestBody CarMember carMember) {
        return ResponseEntity.ok(carMemberRepository.save(carMember));
    }
}
