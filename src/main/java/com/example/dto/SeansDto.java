package com.example.dto;

import com.example.entity.Screening;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeansDto {
    private String cinemHallName;
    private List<ScreeningDto> screeningDtos;

}
