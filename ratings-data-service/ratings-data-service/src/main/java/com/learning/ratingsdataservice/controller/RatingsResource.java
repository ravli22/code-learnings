package com.learning.ratingsdataservice.controller;

import com.learning.ratingsdataservice.model.Rating;
import com.learning.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {
    @GetMapping("/{movieId}")
    public Rating getRatings(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }
    @GetMapping("/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId){
        List<Rating> userRatings= Arrays.asList(new Rating("500",3),
                new Rating("550",4));
        UserRating userRating = new UserRating();
        userRating.setUserRating(userRatings);
        return userRating;
    }

}
