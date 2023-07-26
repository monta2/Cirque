package com.cirque.cirque;

import com.cirque.cirque.domain.entity.Dresseur;
import com.cirque.cirque.domain.entity.Singe;
import com.cirque.cirque.domain.entity.Spectateur;
import com.cirque.cirque.domain.entity.Tour;
import com.cirque.cirque.domain.enumuration.TypeTour;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CirqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(CirqueApplication.class, args);

		List<Tour> listToursSinge1 =new ArrayList<>();
		listToursSinge1.add(new Tour("marcher sur les mains",TypeTour.ACROBATIE));
		listToursSinge1.add(new Tour("dance",TypeTour.MUSIQUE));
		listToursSinge1.add(new Tour("marcher sur les pieds",TypeTour.ACROBATIE));
		Singe singe1 = new Singe("singe1",listToursSinge1);



		List<Tour> listToursSinge2 =new ArrayList<>();
		listToursSinge2.add(new Tour("marcher sur les mains",TypeTour.ACROBATIE));
		listToursSinge2.add(new Tour("marcher sur les pieds",TypeTour.ACROBATIE));
		listToursSinge2.add(new Tour("dance",TypeTour.MUSIQUE));
		Singe singe2 = new Singe("singe2",listToursSinge2);

		Dresseur dresseur1 =new Dresseur(singe1);
		Dresseur dresseur2 =new Dresseur(singe2);

		Spectateur spectateur =new Spectateur();

		dresseur1.getListToursSinge().forEach(t->{
			Tour tour = dresseur1.demanderTour(t);
			if(tour.getTypeTour().equals(TypeTour.ACROBATIE)){
				spectateur.applaudit(tour.getNom(),dresseur1.getSinge().getNom());

			}else if(tour.getTypeTour().equals(TypeTour.MUSIQUE)){
				spectateur.siffle(tour.getNom(),dresseur1.getSinge().getNom());

			}
		});


		dresseur2.getListToursSinge().forEach(t->{
			Tour tour = dresseur2.demanderTour(t);
			if(tour.getTypeTour().equals(TypeTour.ACROBATIE)){
				spectateur.applaudit(tour.getNom(),dresseur2.getSinge().getNom());

			}else if(tour.getTypeTour().equals(TypeTour.MUSIQUE)){
				spectateur.siffle(tour.getNom(),dresseur2.getSinge().getNom());

			}
		});












	}


}

