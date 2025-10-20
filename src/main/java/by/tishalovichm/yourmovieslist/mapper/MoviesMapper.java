package by.tishalovichm.yourmovieslist.mapper;

import by.tishalovichm.yourmovieslist.dtos.MovieDtoIn;
import by.tishalovichm.yourmovieslist.dtos.MovieDtoOut;
import by.tishalovichm.yourmovieslist.entities.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MoviesMapper extends DtoMapper<Movie, MovieDtoIn, MovieDtoOut> {
}
