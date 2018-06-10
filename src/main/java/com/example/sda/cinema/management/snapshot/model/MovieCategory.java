package com.example.sda.cinema.management.snapshot.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Set;

@Getter
@Service
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MovieCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.REFRESH)
    private Set<Movie> movies;

    private String name;

}
