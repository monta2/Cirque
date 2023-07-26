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
public class Tour {
    private String nom;
    private TypeTour typeTour;

}
