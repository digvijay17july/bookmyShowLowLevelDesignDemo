package com.bookmyShowLowLevelDesignDemo.service;

import com.bookmyShowLowLevelDesignDemo.entity.Movie;
import com.bookmyShowLowLevelDesignDemo.entity.Screen;

import java.util.List;
import java.util.UUID;

/*
 * @project bookmyShowLowLevelDesignDemo
 * @author Digvijay Singh
 */
public interface ScreenService {
    Screen get(UUID uuid) throws Exception;
    List<Screen> getAll();
    Screen save(Screen screen);
    Screen update(Screen screen);
    boolean delete(UUID id) throws Exception;
}
