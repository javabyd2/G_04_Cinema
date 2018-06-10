package com.example.sda.cinema.management.snapshot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Integer length;
    private MovieCategory category = MovieCategory.HORROR;
    private String description;
    private String actors;
    private String posterUrl;
    private String trailerUrl;
    private LocalDateTime premiereDate;

    @OneToMany(cascade = CascadeType.REFRESH)
    private Set<Seance> seances;
}
