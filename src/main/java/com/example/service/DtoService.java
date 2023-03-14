package com.example.service;

import com.example.dto.MovieDto;
import com.example.dto.PriceTicketDto;
import com.example.dto.ScreeningDto;
import com.example.dto.SeansDto;
import com.example.entity.CinemaHall;
import com.example.entity.Movie;
import com.example.entity.Screening;
import com.example.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DtoService {
    @Autowired
    private MovieService movieService;

    @Autowired
    private ScreeningService screeningService;

    @Autowired
    private TicketService ticketService;

    public static MovieDto moviesDto(Movie movie) {
        return MovieDto.builder().title(movie.getTitle()).genre(movie.getGenre()).date(movie.getDate()).build();
    }

    public static SeansDto seansDto(CinemaHall cinemaHall) {
        List<Screening> screenings = cinemaHall.getScreenings();
        List<ScreeningDto> screeningDtos = new ArrayList<>();
        for (Screening screening : screenings) {
            screeningDtos.add(screeningDto(screening));
        }
        return SeansDto.builder().cinemHallName(cinemaHall.getName()).screeningDtos(screeningDtos).build();
    }

    public static PriceTicketDto priceTicketDto(Ticket ticket) {
        return PriceTicketDto.builder().price(ticket.getPrice()).build();
    }

    public static ScreeningDto screeningDto(Screening screening) {
        List<Ticket> tickets = screening.getTickets();
        List<PriceTicketDto> priceTicketDtos = new ArrayList<>();

        for (Ticket ticket : tickets) {
            priceTicketDtos.add(priceTicketDto(ticket));
        }
        return ScreeningDto.builder().startTime(screening.getStartTime()).priceTicketDtos(priceTicketDtos).build();
    }

}
