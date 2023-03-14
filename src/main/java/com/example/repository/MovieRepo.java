package com.example.repository;

import com.example.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer> {
    Movie findByTitle(String title);
    Movie findByGenre(String genre);
}
