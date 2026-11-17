package com.klef.soa.exam.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarServiceBookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleModel;
    private String serviceType;
    private Double serviceCost;
    private Boolean completed;
}