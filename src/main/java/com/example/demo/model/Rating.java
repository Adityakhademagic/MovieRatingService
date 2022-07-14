package com.example.demo.model;

import java.util.List;

public class Rating {
     String movieId;
     String rating;
    public Rating() {

    }

    public Rating(String movieId, String rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getRating() {
        return rating;
    }

    public static void setRating(String rating) {
        rating = rating;
    }

    public void add(List<Rating> ratings) {
        this.rating =rating;
    }
}
