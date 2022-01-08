package cz.vsb.ekf.zub0050.service;

import cz.vsb.ekf.zub0050.dto.Movie;
import cz.vsb.ekf.zub0050.dao.InitialDemoData;
import java.util.List;

public class Startit {

    public static void up() {

        InitialDemoData init = new InitialDemoData();
        List<Movie> movieList = init.creatingMovie();

        ShowMovie.Intro(init, movieList);
        ShowMovie.showMovie(init, movieList);
    }
}
