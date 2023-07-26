package com.cirque.cirque.domain.entity;

public class Spectateur {

    public void applaudit(String nomTour, String nomSinge) {
        System.out.println("spectateur applaudit pendant le tour d'acrobatie '" + nomTour + "' du " + nomSinge);
    }

    public void siffle(String nomTour, String nomSinge) {
        System.out.println("pectateur siffle pendant le tour de musique '" + nomTour + "' du " + nomSinge);
    }
}

