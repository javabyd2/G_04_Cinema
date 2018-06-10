package com.example.sda.cinema.management.snapshot.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private int length;
    private MovieCategory category = MovieCategory.HORROR;

    public Movie(String title, int length) {
        this.title = title;
        this.length = length;
    }
}
