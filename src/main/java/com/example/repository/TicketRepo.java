package com.example.repository;

import com.example.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface TicketRepo extends JpaRepository<Ticket,Integer> {
    Ticket findBySeatNumber(Integer seatNumber);
    Ticket findByPrice(BigDecimal price);
}
