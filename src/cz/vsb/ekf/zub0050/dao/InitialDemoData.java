package cz.vsb.ekf.zub0050.dao;

import cz.vsb.ekf.zub0050.dto.Genre;

import cz.vsb.ekf.zub0050.dto.Movie;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.util.ArrayList;
import java.util.List;

public class InitialDemoData {

    public List<Movie> movieList = new ArrayList<>();
    private static final SecureRandom random = new SecureRandom();

    public List<Movie> creatingMovie() {

        for (int i = 1; i <= 7; i++) {
            Movie m = new Movie();
            m.setId(i);
            m.setName(movieName[random.nextInt(movieName.length)]);
            m.setGenre(randomEnum(Genre.class));
            m.setPremiere(i % 10 != 0);
            m.setScore(0 + (int) (Math.random() * ((100 - 0) + 1)));
            m.setLength((LocalTime.of(2, 59).minusHours(random.nextInt(2)).minusMinutes(random.nextInt(59))));
            m.setTime((LocalDateTime.now().plusDays(random.nextInt(7)).plusHours(random.nextInt(24))));

            movieList.add(m);
        }
        return movieList;

    }

    public Movie showMovie(List<Movie> movielist, String in) {
        Movie movie = null;
        for (Movie m : movieList) {
            if (isInteger(in)) {
                if (m.getId() == Integer.parseInt(in)) {
                    movie = m;
                    break;
                }
            } else if (m.getName().equalsIgnoreCase(in)) {
                movie = m;
                break;
            }
        }

        return movie;
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    final static String[] movieName = {
        "Black Widow",
        "Spencer",
        "Zola",
        "Belfast",
        "Dune",
        "West Side Story",
        "Summer of Soul",
        "Pig",
        "No Time to Die",
        "Suicide Squad",
        "The Power of the Dog",
        "CODA",
        "The Green King",
        "Drive My Car",
        "Spider-Man: No Way Home",
        "Licorice Pizza",
        "Anette",
        "Mission Impossible",
        "Gentlemen",
        "Kung-fu Panda",
        "Bad Trip",
        "Nightmare Alley",
        "The Card Counter",};

    public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

}
