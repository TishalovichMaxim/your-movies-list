package by.tishalovichm.yourmovieslist.services;

import by.tishalovichm.yourmovieslist.dtos.MovieDtoIn;
import by.tishalovichm.yourmovieslist.dtos.MovieDtoOut;
import by.tishalovichm.yourmovieslist.entities.Movie;
import by.tishalovichm.yourmovieslist.mapper.MoviesMapper;
import by.tishalovichm.yourmovieslist.repositories.MoviesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MoviesService {

    private final MoviesMapper mapper;

    private final MoviesRepository repository;

    public Iterable<MovieDtoOut> findAll() {
        return mapper.toDto(repository.findAll());
    }

    public MovieDtoOut create(MovieDtoIn dtoIn) {
        Movie movie = mapper.fromDto(dtoIn);
        repository.save(movie);
        return mapper.toDto(movie);
    }

    public MovieDtoOut update(UUID movieId, MovieDtoIn dtoIn) {
        Movie movie = mapper.fromDto(dtoIn);
        movie.setId(movieId);
        repository.save(movie);
        return mapper.toDto(movie);
    }
}
