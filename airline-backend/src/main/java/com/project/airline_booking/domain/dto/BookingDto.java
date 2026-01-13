package com.project.airline_booking.domain.dto;

import com.project.airline_booking.enums.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {
    private Long id;

    private String bookingReference;

    private UserDto user;

    private FlightDto flight;

    private LocalDateTime bookingDate;

    private BookingStatus bookingStatus;

    private List<PassengerDto> passengers;

}
