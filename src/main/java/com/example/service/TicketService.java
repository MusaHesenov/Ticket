package com.example.service;

import com.example.entity.Ticket;
import com.example.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TicketService {
    @Autowired
    TicketRepo ticketRepo;

    public Ticket getTicketById(Integer id) {
        return ticketRepo.findById(id).get();
    }

    public Ticket getBySeatNumber(Integer seatNumber) {
        return ticketRepo.findBySeatNumber(seatNumber);
    }

    public Ticket getByPrice(BigDecimal price) {
        return ticketRepo.findByPrice(price);
    }
}
