package by.tishalovichm.yourmovieslist.controllers;

import by.tishalovichm.yourmovieslist.dtos.UserDtoIn;
import by.tishalovichm.yourmovieslist.dtos.UserDtoOut;
import by.tishalovichm.yourmovieslist.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService service;

    @PostMapping
    public UserDtoOut create(@RequestBody UserDtoIn userDtoIn) {
        return service.create(userDtoIn);
    }
}
