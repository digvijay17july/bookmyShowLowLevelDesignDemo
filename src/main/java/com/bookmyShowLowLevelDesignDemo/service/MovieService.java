package com.bookmyShowLowLevelDesignDemo.service;

import com.bookmyShowLowLevelDesignDemo.entity.Movie;

import java.util.List;
import java.util.UUID;

/*
 * @project bookmyShowLowLevelDesignDemo
 * @author Digvijay Singh
 */
public interface MovieService {

    Movie get(UUID uuid) throws Exception;
    List<Movie> search(String pattern);
    List<Movie> getAll();
    Movie save(Movie movie);
    Movie update(Movie movie);
    boolean delete(UUID id) throws Exception;
}
