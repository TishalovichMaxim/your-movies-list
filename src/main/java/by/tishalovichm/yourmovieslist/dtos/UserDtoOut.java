package by.tishalovichm.yourmovieslist.dtos;

import by.tishalovichm.yourmovieslist.entities.UserRole;

public record UserDtoOut(
    Long id,
    String login,
    UserRole userRole
) {
}
