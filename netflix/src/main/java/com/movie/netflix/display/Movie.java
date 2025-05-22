package com.movie.netflix.display;

import lombok.Data;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@Component
@Data
public class Movie {
    @JsonProperty("Title")
    private String title;

    @JsonProperty("Year")
    private String year;

    @JsonProperty("Rated")
    private String rated;

    @JsonProperty("Released")
    private String released;

    @JsonProperty("Runtime")
    private String runtime;

    @JsonProperty("Genre")
    private String genre;

    @JsonProperty("Director")
    private String director;

    @JsonProperty("Writer")
    private String writer;

    @JsonProperty("Actors")
    private String actors;

    @JsonProperty("Plot")
    private String plot;

    @JsonProperty("Language")
    private String language;

    @JsonProperty("Awards")
    private String awards;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("Poster")
    private String poster;

    @JsonProperty("Ratings")
    private List<Rating> ratings;

    @JsonProperty("Metascore")
    private String metascore;

    @JsonProperty("imdbRating")
    private String imdbRating;

    @JsonProperty("imdbVotes")
    private String imdbVotes;

    @JsonProperty("imdbID")
    private String imdbID;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("BoxOffice")
    private String boxOffice;

    @JsonProperty("Response")
    private String response;

    // Optional custom field
    private String link;
}
