package cz.vsb.ekf.zub0050.service;

import cz.vsb.ekf.zub0050.dto.Movie;
import cz.vsb.ekf.zub0050.dao.InitialDemoData;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Export extends Booking {

    @Override
    public void export(InitialDemoData init, List<Movie> movieList) {

        movie = init.showMovie(movieList, input);

        LocalDateTime excualTime = movie.getTime();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd HH:00 a, YYYY");

        int TicketNumber = (0 + (int) (Math.random() * ((99999 - 10000) + 1)));

        try ( FileWriter fw = new FileWriter("ticket.txt")) {
            fw.write("Ticket number: " + TicketNumber + "\n Nazev: " + movie.getName() + "\n Zanr: " + movie.getGenre() + "\n Premiera: " + movie.getPremiere() + "\n Doba trvani: " + movie.getLength() + " [h:m]" + "\n Cas promitani: " + dtf.format(excualTime));

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
