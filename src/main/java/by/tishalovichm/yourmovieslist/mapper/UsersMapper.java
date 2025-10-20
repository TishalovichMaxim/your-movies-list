package by.tishalovichm.yourmovieslist.mapper;

import by.tishalovichm.yourmovieslist.dtos.UserDtoIn;
import by.tishalovichm.yourmovieslist.dtos.UserDtoOut;
import by.tishalovichm.yourmovieslist.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsersMapper extends DtoMapper<User, UserDtoIn, UserDtoOut> {
}
