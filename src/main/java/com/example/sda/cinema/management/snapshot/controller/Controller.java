package com.example.sda.cinema.management.snapshot.controller;


import com.example.sda.cinema.management.snapshot.model.Movie;
import com.example.sda.cinema.management.snapshot.model.MovieCategory;
import com.example.sda.cinema.management.snapshot.service.CategoryService;
import com.example.sda.cinema.management.snapshot.model.Ticket;
import com.example.sda.cinema.management.snapshot.service.MovieService;
import com.example.sda.cinema.management.snapshot.model.Seance;
import com.example.sda.cinema.management.snapshot.service.SeanceService;
import com.example.sda.cinema.management.snapshot.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "api")
@RestController
public class Controller {

    @Autowired
    private MovieService movieService;

    @Autowired
    private SeanceService seanceService;

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private TicketService ticketService;


    @RequestMapping(value = "/addmovie", method = RequestMethod.POST)
    public Movie addMovie (@RequestBody Movie movie) {return movieService.save(movie);}

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> showMovies() {return movieService.getMovies();}

    @RequestMapping(value = "/addcategory", method = RequestMethod.POST)
    public MovieCategory addCategory (@RequestBody MovieCategory category) { return categoryService.save(category);}

    @RequestMapping(value = "/categories",method = RequestMethod.GET)
    public List<MovieCategory> showCategories() {return categoryService.getCategories();}

    @RequestMapping(value ="/addseance",method = RequestMethod.POST)
    public Seance addSeance(@RequestBody Seance seance){
        return seanceService.save(seance);
    }

    @RequestMapping(value = "/getseance", method = RequestMethod.GET)
    public List<Seance> seanceList(){
        return seanceService.getSeance();
    }

    @RequestMapping(value="/addticket", method =RequestMethod.POST)
    public Ticket addTicket(@RequestBody Ticket ticket){
        return ticketService.save(ticket);
    }

    @RequestMapping(value = "/getticket", method = RequestMethod.GET)
    public List<Ticket> ticketList(){
        return ticketService.getTicket();
    }



}
