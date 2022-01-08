package cz.vsb.ekf.zub0050.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Movie {

    private Integer id;
    private String name;
    private Genre genre;
    private Boolean premiere;
    private Integer score;
    private LocalTime length;
    private LocalDateTime time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Boolean getPremiere() {
        return premiere;
    }

    public void setPremiere(Boolean premiere) {
        this.premiere = premiere;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public LocalTime getLength() {
        return length;
    }

    public void setLength(LocalTime length) {
        this.length = length;

    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Film "
                + "ID: " + id
                + ", Nazev filmu: " + name
                + ", Zanr: " + genre
                + ", Premiera: " + premiere
                + ", Hodnoceni: " + score + " %"
                + ", Delka filmu: " + length
                + ", Promitaci cas: " + time
                + " ";
    }

}
