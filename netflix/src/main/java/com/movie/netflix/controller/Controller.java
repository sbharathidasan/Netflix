package com.movie.netflix.controller;

import com.movie.netflix.Service.ServiceClass;
import com.movie.netflix.display.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home")
public class Controller {
    @Autowired
    private ServiceClass service;
    private String name;
    @GetMapping("/movie")
    public Movie display(@RequestParam String name){
        return service.returnMovieDetail(name);
    }

}
