package com.bookmyShowLowLevelDesignDemo.controller;

import com.bookmyShowLowLevelDesignDemo.entity.Movie;
import com.bookmyShowLowLevelDesignDemo.entity.Screen;
import com.bookmyShowLowLevelDesignDemo.service.ScreenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/*
 * @project bookmyShowLowLevelDesignDemo
 * @author Digvijay Singh
 */
@RestController
@RequestMapping("api/screen")
public class ScreenController {

    private ScreenService screenService;

    public ScreenController(ScreenService screenService) {
        this.screenService = screenService;
    }

    @GetMapping("/{uuid}")
    ResponseEntity<Screen> read(@PathVariable("uuid") String uuid){
        Screen screen=null;
        try
        {
            screen=this.screenService.get(UUID.fromString(uuid));
            return  new ResponseEntity<Screen>(screen, null, HttpStatus.OK);
        }catch (Exception exception){
            return  new ResponseEntity<Screen>(screen,null,HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    Screen create(@RequestBody Screen screen){
        screen=this.screenService.save(screen);
        return  screen;
    }

    @GetMapping
    @RequestMapping("/all")
    List<Screen> getAll(){
        return this.screenService.getAll();
    }


    @PutMapping
    @RequestMapping("/")
    Screen update(Screen screen){
        screen=this.screenService.update(screen);
        return  screen;
    }

}
