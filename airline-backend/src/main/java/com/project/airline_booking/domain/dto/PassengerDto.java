package com.project.airline_booking.domain.dto;

import com.project.airline_booking.enums.PassengerType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDto {
    private UUID id;

    @NotBlank(message = "First name cannot be blank")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    private String lastName;

    private String passportNumber;

    @NotNull(message = "Passenger type cannot be null")
    private PassengerType type;

    private String seatNumber;

    private String specialRequests;

}
