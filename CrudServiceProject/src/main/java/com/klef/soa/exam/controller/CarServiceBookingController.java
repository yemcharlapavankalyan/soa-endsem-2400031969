package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.CarServiceBookingEntity;
import com.klef.soa.exam.service.CarServiceBookingService;

@RestController
public class CarServiceBookingController {

    @Autowired
    private CarServiceBookingService service;

    @GetMapping("/")
    public String home() {
        return "Test API";
    }

    @PostMapping("/add")
    public ResponseEntity<CarServiceBookingEntity> addBooking(
            @RequestBody CarServiceBookingEntity booking) {
        
        CarServiceBookingEntity saved = service.addBooking(booking);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/displayAll")
    public List<CarServiceBookingEntity> displayAll() {
        return service.getAllBookings();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable Long id) {
        if (service.deleteBooking(id)) {
            return ResponseEntity.ok("Deleted the booking");
        }
        return (ResponseEntity<String>) ResponseEntity.notFound();
    }
}