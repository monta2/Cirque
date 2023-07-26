package com.cirque.cirque.domain.entity;

import com.cirque.cirque.domain.enumuration.TypeTour;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Singe {
    public String nom;
    public List<Tour> tours;


    public Tour executerTour(String nom) {
        for (Tour tour:tours) {
            if (tour.getNom().equals(nom)){
                return tour;
            }
        }
        return null;

    }
}
