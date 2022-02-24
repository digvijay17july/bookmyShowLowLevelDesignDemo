package com.bookmyShowLowLevelDesignDemo.entity;

import javax.persistence.*;
import java.util.UUID;

/*
 * @project bookmyShowLowLevelDesignDemo
 * @author Digvijay Singh
 */
@Entity
public class Screen {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private int numberOfSeats;
    @OneToOne(targetEntity = Movie.class,cascade = CascadeType.DETACH)
    @JoinColumn(name = "m_fk",referencedColumnName = "id")
    private Movie movie;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
