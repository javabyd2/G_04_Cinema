package com.example.sda.cinema.management.snapshot.controller;

import com.example.sda.cinema.management.snapshot.model.Movie;
import com.example.sda.cinema.management.snapshot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/addmovie", method = RequestMethod.POST)
    public Movie addMovie (@RequestBody Movie movie) {return movieService.save(movie);}

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> showMovies() {return movieService.getMovies();}

}
