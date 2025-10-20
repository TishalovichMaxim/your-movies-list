package by.tishalovichm.yourmovieslist.security;

import by.tishalovichm.yourmovieslist.entities.User;
import by.tishalovichm.yourmovieslist.mapper.OneDirMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserDetailsMapper extends OneDirMapper<User, CustomUserDetails> {

    @Override
    @Mapping(source = "login", target = "username")
    CustomUserDetails map(User user);
}
