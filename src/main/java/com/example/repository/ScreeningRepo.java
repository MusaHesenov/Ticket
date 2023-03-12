package com.example.repository;

import com.example.entity.CinemaHall;
import com.example.entity.Screening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public interface ScreeningRepo extends JpaRepository<Screening,Integer> {
}
