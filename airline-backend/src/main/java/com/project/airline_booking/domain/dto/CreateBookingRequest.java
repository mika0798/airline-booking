package com.project.airline_booking.domain.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookingRequest {

    @NotNull(message = "Flight Id cannot be null")
    private UUID flightId;

    @NotEmpty(message = "At least one passenger must be provided")
    private List<PassengerDto> passengers;
}
