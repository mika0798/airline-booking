package com.project.airline_booking.domain.dto;

import com.project.airline_booking.enums.FlightStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
public class FlightDto {
    private UUID id;

    private String flightNumber;

    private FlightStatus flightStatus;

    private AirportDto departureAirport;

    private AirportDto arrivalAirport;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private BigDecimal basePrice;

    private List<UserDto> assignedPilots;

    private List<BookingDto> bookings;

    private String departureAirportIataCode;
    private String arrivalAirportIataCode;

}
