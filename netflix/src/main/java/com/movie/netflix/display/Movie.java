package com.movie.netflix.display;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Movie {
    private String title;
    private int year;
    private String rating;
    private String date;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String actors;
    private String plot ;
    private String language;
    private String award;
    private String country;
    private String poster;
    private List<Rating> Ratings;
    private String metascore;
    private String imdbrating;
    private String imdbId;
    private String type;
    private String boxoffice;

    private String link;

}
