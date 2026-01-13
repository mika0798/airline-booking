package com.project.airline_booking.domain.entity;

import com.project.airline_booking.enums.PassengerType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@Entity
@Table(name="passengers")
@NoArgsConstructor
@AllArgsConstructor
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String passportNumber;

    @Column(nullable = false)
    private String seatNumber;

    private String specialRequests;

    @Enumerated(EnumType.STRING)
    private PassengerType type;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

}
