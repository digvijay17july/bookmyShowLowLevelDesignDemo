package com.bookmyShowLowLevelDesignDemo.repository;

import com.bookmyShowLowLevelDesignDemo.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/*
 * @project bookmyShowLowLevelDesignDemo
 * @author Digvijay Singh
 */
@Repository
public interface MovieRepository extends CrudRepository<Movie, UUID> {
}
