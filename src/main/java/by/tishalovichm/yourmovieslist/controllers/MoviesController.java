package by.tishalovichm.yourmovieslist.controllers;

import by.tishalovichm.yourmovieslist.dtos.MovieDtoIn;
import by.tishalovichm.yourmovieslist.dtos.MovieDtoOut;
import by.tishalovichm.yourmovieslist.services.MoviesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/movies")
public class MoviesController {

    private final MoviesService service;

    @GetMapping
    public Iterable<MovieDtoOut> getAll() {
        return service.findAll();
    }

    @PostMapping
    public MovieDtoOut create(@RequestBody MovieDtoIn dtoIn) {
        return service.create(dtoIn);
    }

    @PutMapping("{movieId}")
    public MovieDtoOut update(@PathVariable UUID movieId, @RequestBody MovieDtoIn dtoIn) {
        return service.update(movieId, dtoIn);
    }
}
