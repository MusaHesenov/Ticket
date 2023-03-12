package com.example.service;

import com.example.entity.CinemaHall;
import com.example.repository.CinemaHallRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaHallService {
    @Autowired
    CinemaHallRepo cinemaHallRepo;

    public CinemaHall getCinemaHallById(Integer id){
        return cinemaHallRepo.findById(id).get();
    }

    public CinemaHall getCinemaHallByName(String name){
        return cinemaHallRepo.findByName(name);
    }

}
