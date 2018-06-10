package com.example.sda.cinema.management.snapshot.repository;

import com.example.sda.cinema.management.snapshot.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
}
