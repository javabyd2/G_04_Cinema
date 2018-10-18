package com.example.sda.cinema.management.snapshot.exception;

public class HallNotFoundException extends  RuntimeException {
    public HallNotFoundException(Long id){
        super("Nie moge znalezc sali " + id);
    }
}
