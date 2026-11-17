package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.CarServiceBookingEntity;
import com.klef.soa.exam.repository.CarServiceBookingRepository;

@Service
public class CarServiceBookingServiceImpl implements CarServiceBookingService {

    @Autowired
    private CarServiceBookingRepository repository;

    @Override
    public CarServiceBookingEntity addBooking(CarServiceBookingEntity booking) {
        return repository.save(booking);
    }

    @Override
    public List<CarServiceBookingEntity> getAllBookings() {
        return repository.findAll();
    }

    @Override
    public boolean deleteBooking(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}