package com.example.repository;

import com.example.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
@Repository
public interface TicketRepo extends JpaRepository<Ticket,Integer> {
    Ticket findBySeatNumber(Integer seatNumber);
    Ticket findByPrice(BigDecimal price);
}
