package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Entity
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer capacity;
    private String seatArrangement;
    @OneToMany
    @JoinTable(name = "cinema_hall_screenin",joinColumns = {@JoinColumn(name = "cinema_hall_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "screening_id",referencedColumnName = "id")})
    private List<Screening> screenings;

}
