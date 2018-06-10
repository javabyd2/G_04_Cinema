package com.example.sda.cinema.management.snapshot.service;

import com.example.sda.cinema.management.snapshot.model.Ticket;
import com.example.sda.cinema.management.snapshot.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getTicket(){
        return ticketRepository.findAll();
    }

    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
