package com.example.sda.cinema.management.snapshot.service;


import com.example.sda.cinema.management.snapshot.exception.HallNotFoundException;
import com.example.sda.cinema.management.snapshot.model.Hall;
import com.example.sda.cinema.management.snapshot.repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HallService {
    @Autowired
    private HallRepository hallRepository;

    public List<Hall> getSeance(){
        return hallRepository.findAll();
    }

    @Transactional
    public Hall save(Hall hall) {
        return hallRepository.save(hall);
    }

    public Hall getSeanceById(Long id){
        Hall hall = hallRepository.findById(id).orElseThrow(
                () -> new HallNotFoundException(id)
        );
        return hall;
    }
}
