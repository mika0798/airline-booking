package com.project.airline_booking.domain.dto;

import com.project.airline_booking.enums.City;
import com.project.airline_booking.enums.Country;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirportDto {
    private UUID id;

    @NotBlank(message = "Airport name is required")
    private String name;

    @NotNull(message = "City is required")
    private City city;

    @NotNull(message = "Country is required")
    private Country country;

    @NotBlank(message = "IATA code is required")
    private String iataCode;

}
