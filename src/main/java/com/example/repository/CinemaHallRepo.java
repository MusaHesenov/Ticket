package com.example.repository;

import com.example.entity.CinemaHall;
import com.example.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaHallRepo extends JpaRepository<CinemaHall,Integer> {
    CinemaHall findByName(String name);
}
