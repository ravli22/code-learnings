package com.learning.moviecatalogservice.controller;

import com.learning.moviecatalogservice.model.CatalogItem;
import com.learning.moviecatalogservice.model.Movie;
import com.learning.moviecatalogservice.model.Rating;
import com.learning.moviecatalogservice.model.UserRating;
import com.learning.moviecatalogservice.service.MovieInfo;
import com.learning.moviecatalogservice.service.UserRatingInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    private MovieInfo movieInfo;

    @Autowired
    private UserRatingInfo userRatingInfo;

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathParam("userId") String userId){

        //get all rated movies
        UserRating ratings = userRatingInfo.getUserRating( userId );

        //for each movie , get the movie details by calling movie-info api
        return ratings.getUserRating().stream()
                .map(rating -> movieInfo.getCatalogItem( rating ))
                .collect(Collectors.toList());

    }


    public List<CatalogItem> getFallBackCatalog(@PathParam("userId") String userId) {
        return  Arrays.asList(new CatalogItem("No movie","",0));
    }

}
/* Movie movie = webClientBuilder.build()
                            .get()
                            .uri("http://localhost:8082/movies/" + rating.getMovieId())
                            .retrieve()
                            .bodyToMono(Movie.class)
                            .block();*/

