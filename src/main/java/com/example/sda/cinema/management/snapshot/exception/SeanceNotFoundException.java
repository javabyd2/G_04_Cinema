package com.example.sda.cinema.management.snapshot.exception;

public class SeanceNotFoundException extends RuntimeException {
    public SeanceNotFoundException(Long id){
        super("Nie moge znalezc seansu " + id);
    }
}
