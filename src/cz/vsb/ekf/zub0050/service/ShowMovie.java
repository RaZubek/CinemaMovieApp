package cz.vsb.ekf.zub0050.service;

import cz.vsb.ekf.zub0050.dto.Movie;
import cz.vsb.ekf.zub0050.dao.InitialDemoData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ShowMovie {

    public static void Intro(InitialDemoData init, List<Movie> movieList) {

        System.out.println("Vitejte v rezervacni aplikaci naseho kina!");
        System.out.println("---------------------");
        System.out.println("Tento tyden promitame: ");

        for (Movie m : movieList) {

            System.out.println(m.getId() + ". " + m.getName());
        }

    }

    public static void showMovie(InitialDemoData init, List<Movie> movieList) {
        String input;
        Movie movie;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadejte cislo 1-7 pro zobrazeni detailu vybraneho filmu");
        System.out.println("---------------------");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            System.out.println("---------------------");
            Booking.booking(init, movieList);
            return;
        }
        if (input.equalsIgnoreCase("n")) {
            System.out.println("Snad nekdy priste, nashledanou.");
                System.exit(0);
        }
        movie = init.showMovie(movieList, input);

        if (movie == null) {
            System.out.println("Chyba: priste zkuste zadat cislo 1-7");
        }

        if (movie != null) {

            LocalDateTime excualTime = movie.getTime();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd HH:00 a, YYYY");

            System.out.println("Nazev filmu:          " + movie.getName());
            System.out.println("Zanr:                 " + movie.getGenre());
            System.out.println("Premiera:             " + movie.getPremiere());
            System.out.println("Hodnoceni:            " + movie.getScore() + " %");
            System.out.println("Delka filmu:          " + movie.getLength() + " [h:m]");
            System.out.println("Cas promitani:        " + dtf.format(excualTime));

            System.out.println("---------------------");
            System.out.println("Pokud mate vybrano zadejte Y, pokud chcete odejit zadejte N");
            showMovie(init, movieList);
            
            scanner.close();
        }

    }

}
