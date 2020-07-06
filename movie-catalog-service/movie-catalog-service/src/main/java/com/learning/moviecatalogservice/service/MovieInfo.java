package com.learning.moviecatalogservice.service;

import com.learning.moviecatalogservice.model.CatalogItem;
import com.learning.moviecatalogservice.model.Movie;
import com.learning.moviecatalogservice.model.Rating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieInfo {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallBackCatalogItem")
    public CatalogItem getCatalogItem(Rating rating) {
        Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
        return new CatalogItem(movie.getName(),movie.getDesc(),rating.getRating());
    }
    public CatalogItem getFallBackCatalogItem(Rating rating) {
        return new CatalogItem("No movie name","",rating.getRating());
    }
}
