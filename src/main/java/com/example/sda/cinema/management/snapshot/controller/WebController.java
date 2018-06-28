package com.example.sda.cinema.management.snapshot.controller;

import com.example.sda.cinema.management.snapshot.model.Movie;
import com.example.sda.cinema.management.snapshot.model.Seance;
import com.example.sda.cinema.management.snapshot.service.CategoryService;
import com.example.sda.cinema.management.snapshot.service.MovieService;
import com.example.sda.cinema.management.snapshot.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WebController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SeanceService seanceService;

    @GetMapping(value = "home")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping(value = "/movies")
    public ModelAndView showMovies() {
        ModelAndView modelAndView = new ModelAndView("movies");
        modelAndView.addObject("moviesList", movieService.getMovies());
        return modelAndView;
    }

    @GetMapping(value = "newmovie")
    public ModelAndView newMovie() {
        ModelAndView modelAndView = new ModelAndView("addmovieform");
        modelAndView.addObject("categoryList", categoryService.getCategories());
        modelAndView.addObject("movie", new Movie());
        return modelAndView;
    }

    @PostMapping(value = "newmovie")
    public String addMovie(@ModelAttribute Movie movie, RedirectAttributes redirectAttributes) {
        movieService.save(movie);
        redirectAttributes.addFlashAttribute("message", "DODANO");
        return "redirect:newmovie";
    }

    @GetMapping(value = "/seances")
    public ModelAndView showSeances() {
        ModelAndView modelAndView = new ModelAndView("seances");
        modelAndView.addObject("seancesList", seanceService.getSeance());
        return modelAndView;
    }

    @GetMapping(value = "/getseance")
    public ModelAndView newSeance() {
        ModelAndView modelAndView = new ModelAndView("addseanceform");
        modelAndView.addObject("seance", new Seance());
        return modelAndView;
    }

    @PostMapping(value = "/addseance")
    public String addSeance(@ModelAttribute("addseance") Seance seance, RedirectAttributes redirectAttributes) {
        seanceService.save(seance);
        redirectAttributes.addFlashAttribute("message", "DODANO");
        return "redirect:newseance";
    }

}
