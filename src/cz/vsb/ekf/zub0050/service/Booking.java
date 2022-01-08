package cz.vsb.ekf.zub0050.service;

import cz.vsb.ekf.zub0050.dto.Movie;
import cz.vsb.ekf.zub0050.dao.InitialDemoData;
import java.util.List;
import java.util.Scanner;

abstract class Booking {

    static String input;
    static Movie movie;

    public abstract void export(InitialDemoData init, List<Movie> movieList);

    public static void booking(InitialDemoData init, List<Movie> movieList) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Zadejte cislo 1-7 jako Vas finalni verdikt");
        System.out.println("---------------------");
        input = scan.nextLine();

        Export e = new Export();
        movie = init.showMovie(movieList, input);

        if (movie == null) {
            System.out.println("Chyba: priste zkuste zadat cislo 1-7");
        }

        if (movie != null) {
            System.out.println("Prejte si rezervovat film: " + movie.getName() + " Y/N ?");

            String in;
            Scanner sc = new Scanner(System.in);

            in = sc.nextLine();

            if (in.equalsIgnoreCase("y")) {
                System.out.println("Vas listek byl uspesne rezervovan a vytisknut");
                System.out.println("Nezapomente si ho vzit sebou pri vstupu. Budeme se tesit, navidenou!");
                e.export(init, movieList);
            } else {
                System.out.println("Zkuste to znovu.");
                booking(init, movieList);
                sc.close();
            }

        }
        scan.close();
    }

}
