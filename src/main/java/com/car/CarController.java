package com.car;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api/car")
public class CarController {

    @GetMapping(value = "/")
    public ResponseEntity<String> getCar() {
        return ResponseEntity.ok("first car");
    }
}
