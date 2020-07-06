package com.learning.moviecatalogservice.service;

import com.learning.moviecatalogservice.model.Rating;
import com.learning.moviecatalogservice.model.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;
import java.util.Arrays;

@Service
public class UserRatingInfo {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallBackUserRating",
        commandProperties = {
                @HystrixProperty( name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000"),
                @HystrixProperty( name = "circuitBreaker.requestVolumeThreshold", value = "5"),
                @HystrixProperty( name = "circuitBreaker.errorThresholdPercentage",value = "50"),
                @HystrixProperty( name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000")
        })
    public UserRating getUserRating(@PathParam("userId") String userId) {
        return restTemplate.getForObject( "http://ratings-data-service/ratings/users/" + userId, UserRating.class );
    }
    public UserRating getFallBackUserRating(@PathParam("userId") String userId) {
        UserRating rating = new UserRating();
        rating.setUserRating( Arrays.asList( new Rating("No movie",0) ) );
        return rating;
    }
}
