package by.tishalovichm.yourmovieslist.dtos;

import java.util.UUID;

public record MovieDtoOut(
    UUID id,
    String name,
    String description,
    Float rating
) {
}
