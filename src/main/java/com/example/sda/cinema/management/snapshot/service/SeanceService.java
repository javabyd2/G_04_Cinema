package com.example.sda.cinema.management.snapshot.service;

import com.example.sda.cinema.management.snapshot.model.Seance;
import com.example.sda.cinema.management.snapshot.repository.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SeanceService {

    @Autowired
    private SeanceRepository seanceRepository;

    public List<Seance> getSeance(){
        return seanceRepository.findAll();
    }

    public Seance save(Seance seance) {
        return seanceRepository.save(seance);
    }

}
