package com.cirque.cirque.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Dresseur {

    public Singe singe;
    public Tour demanderTour(String nom) {

            return singe.executerTour(nom);

    }

    public  List<String> getListToursSinge(){
        return singe.getTours().stream().map(t->t.getNom()).collect(Collectors.toList());
    }
}