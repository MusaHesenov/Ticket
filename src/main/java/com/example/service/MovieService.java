package com.example.service;

import com.example.entity.Movie;
import com.example.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepo movieRepo;

    public List<Movie> getAll() {//moterizeye niye hecne yazmiriq
        return movieRepo.findAll();
    }

    public Movie getMovieById(Integer id) {
        return movieRepo.findById(id).get();
    }

    public Movie save(Movie movie) {
        return movieRepo.save(movie);
    }

    public List<Movie> saveAll(List<Movie> movies) {
        return movieRepo.saveAll(movies);
    }

    public Movie getByTitle(String title){
        return movieRepo.findByTitle(title);
    }

    public Movie getByGenre(String genre){
        return movieRepo.findByGenre(genre);
    }
}
