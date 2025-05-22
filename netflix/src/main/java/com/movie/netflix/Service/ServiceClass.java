package com.movie.netflix.Service;

import com.movie.netflix.display.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

@Service
public class ServiceClass {
    @Value("${apikey}")
    private String api;
    @Autowired
    private Movie movie;

    public Movie returnMovieDetail(String name){
        String link="https://www.omdbapi.com/?t="+name+"&apikey="+api;
        System.out.println(link);
        RestTemplate restTemplate=new RestTemplate();
        movie =restTemplate.getForObject(link,Movie.class);
        System.out.println(movie);
        return movie;
    }


}
//public Movie fetchMovieFromOMDb(String title) {
//    String url = "https://www.omdbapi.com/?t=" + title + "&apikey=" + apiKey;
//    RestTemplate restTemplate = new RestTemplate();
//    Movie movie = restTemplate.getForObject(url, Movie.class);
//    return movie;
//}