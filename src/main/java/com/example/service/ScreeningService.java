package com.example.service;

import com.example.entity.Screening;
import com.example.repository.ScreeningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreeningService {
    @Autowired
    ScreeningRepo screeningRepo;

    public Screening getScreeningById(Integer id) {
        return screeningRepo.findById(id).get();
    }


}
