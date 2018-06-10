package com.example.sda.cinema.management.snapshot.model;

import java.io.Serializable;

public enum MovieCategory implements Serializable{
    HORROR, KOMEDIA, DOKUMENT, DRAMAT, PRZYGODOWY;

    public String getCategory(){
        return this.name();
    }
}
