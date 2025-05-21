package com.movie.netflix.Service;

import com.movie.netflix.display.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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
        System.out.println(name);
//        try {
//            getImdbRequest(name);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        movie.setName(name);
        return movie;
    }
    private void getImdbRequest(String name) throws IOException, InterruptedException {
        String link="https://www.omdbapi.com/?t="+name+"&apikey="+api;
        URI uri=URI.create(link);
        HttpClient client=HttpClient.newHttpClient() ;
        HttpRequest request=HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .header("Accept","application/json")
                .timeout(Duration.ofSeconds(10))
                .build();
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        System.out.println(response.body());
        System.out.println(link);
    }


}
