package com.example.sda.cinema.management.snapshot.repository;

import com.example.sda.cinema.management.snapshot.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
