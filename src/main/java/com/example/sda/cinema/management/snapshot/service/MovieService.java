package com.example.sda.cinema.management.snapshot.service;

import com.example.sda.cinema.management.snapshot.model.Movie;
import com.example.sda.cinema.management.snapshot.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovies() {return movieRepository.findAll();}

    public Movie save (Movie movie){ return movieRepository.save(movie);}

}
