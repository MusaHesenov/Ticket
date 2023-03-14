package com.example.entity;

import com.example.enums.State;
import com.example.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer seatNumber;
    private BigDecimal price;
    private State state;
    private Status status;

}
