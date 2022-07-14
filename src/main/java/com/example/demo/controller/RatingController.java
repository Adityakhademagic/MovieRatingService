package com.example.demo.controller;

import com.example.demo.model.Rating;
import com.example.demo.model.UserRating;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {


    public List<Rating> ratings = Arrays.asList(
            new Rating("123", "4"),
            new Rating("456","3")
    );
    @GetMapping("/{movieId}")
    public Rating getAllRating(@PathVariable("movieId") String movieId) {

        return new Rating(movieId,"4");

    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
    @PostMapping(value= "/addRatings",consumes = {"application/json","application/xml"})
    public List<Rating> addRating(@RequestBody List<Rating> rating) {
        System.out.println(rating);


        ratings.addAll(rating);
        return rating;


    }



}
