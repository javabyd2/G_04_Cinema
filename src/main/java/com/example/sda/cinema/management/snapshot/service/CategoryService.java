package com.example.sda.cinema.management.snapshot.service;

import com.example.sda.cinema.management.snapshot.model.MovieCategory;
import com.example.sda.cinema.management.snapshot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<MovieCategory> getCategories(){return categoryRepository.findAll();}

    public MovieCategory save (MovieCategory category) {return categoryRepository.save(category);}

}
