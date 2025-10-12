package by.tishalovichm.yourmovieslist.controllers;

import by.tishalovichm.yourmovieslist.entities.Movie;
import by.tishalovichm.yourmovieslist.services.MoviesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("movies")
public class MoviesController {

    private final MoviesService service;

    @GetMapping
    public Iterable<Movie> getMovies() {
        return service.findAll();
    }
}
