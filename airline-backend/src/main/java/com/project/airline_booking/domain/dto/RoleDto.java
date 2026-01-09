package com.project.airline_booking.domain.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {

    private UUID id;

    @NotEmpty(message = "Name is required")
    private String name;
}
