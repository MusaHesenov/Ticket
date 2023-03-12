package com.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String paymentInformation;


    @Size(min = 5,max = 15, message = "Size of username must be between 5 and 15")
    private String userName;

    @Column(nullable = false)
    @Size(min = 5,max = 15,message = "Size of password must be between 5 and 15")
    private String password;

    @OneToMany
    @JoinTable(name = "costumer_ticket",joinColumns = {@JoinColumn(name = "customer_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "ticket_id",referencedColumnName = "id")})
    private List<Ticket> tickets;
}
