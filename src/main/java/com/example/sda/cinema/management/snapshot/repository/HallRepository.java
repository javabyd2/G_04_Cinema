package com.example.sda.cinema.management.snapshot.repository;

import com.example.sda.cinema.management.snapshot.model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallRepository extends JpaRepository<Hall, Long> {
}
