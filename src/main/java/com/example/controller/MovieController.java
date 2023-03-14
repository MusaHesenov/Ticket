package com.example.controller;

import com.example.dto.MovieDto;
import com.example.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private MovieService movieService;

    @GetMapping("/tickets")
    public ResponseEntity<List<MovieDto>> getTickets() {
        return new ResponseEntity<List<MovieDto>>(movieService.getMovies(), HttpStatus.OK);//seatNumber,price
    }

    @GetMapping("/seans")
    public ResponseEntity<List<MovieDto>> getSeans() {
        return new ResponseEntity<List<MovieDto>>(movieService.getMovies(), HttpStatus.OK);//seatNumber,price
    }
}
