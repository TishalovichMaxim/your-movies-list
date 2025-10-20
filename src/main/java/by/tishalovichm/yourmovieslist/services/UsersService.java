package by.tishalovichm.yourmovieslist.services;

import by.tishalovichm.yourmovieslist.dtos.UserDtoIn;
import by.tishalovichm.yourmovieslist.dtos.UserDtoOut;
import by.tishalovichm.yourmovieslist.entities.User;
import by.tishalovichm.yourmovieslist.entities.UserRole;
import by.tishalovichm.yourmovieslist.mapper.UsersMapper;
import by.tishalovichm.yourmovieslist.repositories.UserRolesRepository;
import by.tishalovichm.yourmovieslist.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersMapper mapper;

    private final UsersRepository usersRepository;

    private final UserRolesRepository usersRolesRepository;

    private final PasswordEncoder passwordEncoder;

    public UserDtoOut create(UserDtoIn userDtoIn) {
        User user = mapper.fromDto(userDtoIn);
        UserRole userRole = usersRolesRepository.findById(
            UserRole.USER_ID).orElseThrow();

        user.setRole(userRole);

        String passwordHash = passwordEncoder.encode(userDtoIn.password());
        user.setPasswordHash(passwordHash);

        usersRepository.save(user);

        return mapper.toDto(user);
    }

    public User getById(long id) {
        return usersRepository.findById(id).orElseThrow();
    }

    public User getByLogin(String login) {
        return usersRepository.findByLogin(login);
    }
}
