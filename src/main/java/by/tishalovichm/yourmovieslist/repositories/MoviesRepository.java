package by.tishalovichm.yourmovieslist.repositories;

import by.tishalovichm.yourmovieslist.entities.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository<Movie, Long> {
}
