package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.CarServiceBookingEntity;

public interface CarServiceBookingService {

    CarServiceBookingEntity addBooking(CarServiceBookingEntity booking);

    List<CarServiceBookingEntity> getAllBookings();

    boolean deleteBooking(Long id);
}