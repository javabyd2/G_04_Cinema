package com.example.sda.cinema.management.snapshot.repository;

import com.example.sda.cinema.management.snapshot.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
