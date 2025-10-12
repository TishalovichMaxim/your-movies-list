package by.tishalovichm.yourmovieslist.services;

import by.tishalovichm.yourmovieslist.entities.Movie;
import by.tishalovichm.yourmovieslist.repositories.MoviesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MoviesService {

    private final MoviesRepository repository;

    public Iterable<Movie> findAll() {
        return repository.findAll();
    }


}
