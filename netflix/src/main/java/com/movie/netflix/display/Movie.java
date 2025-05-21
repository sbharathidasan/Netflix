package com.movie.netflix.display;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Movie {
    private String name;
    private double imdb;
    private String link;

}
