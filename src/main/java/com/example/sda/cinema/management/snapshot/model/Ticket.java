package com.example.sda.cinema.management.snapshot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer price;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Seance seance;

    private TicketStatus ticketStatus;

    private Integer rowNumber;

    private Integer seatInRow;

}
