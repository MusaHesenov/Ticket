package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private String title;
    private String genre;
    private LocalDate date;
    private BigDecimal price;
}
