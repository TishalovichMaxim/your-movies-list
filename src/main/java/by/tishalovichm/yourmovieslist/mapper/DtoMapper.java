package by.tishalovichm.yourmovieslist.mapper;

public interface DtoMapper<E, I, O> {

    E fromDto(I dtoIn);

    O toDto(E entity);

    Iterable<O> toDto(Iterable<E> entity);
}
