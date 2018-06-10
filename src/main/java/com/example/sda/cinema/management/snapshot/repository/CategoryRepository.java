package com.example.sda.cinema.management.snapshot.repository;

import com.example.sda.cinema.management.snapshot.model.MovieCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<MovieCategory, Long> {
}
