package com.project.airline_booking.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.airline_booking.enums.AuthMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private UUID id;

    private String name;

    private String email;

    private String phoneNumber;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private boolean emailVerified;

    private boolean isActive;

    private AuthMethod provider;
    private String providerId;

    private List<RoleDto> roles;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
