package by.tishalovichm.yourmovieslist.security;

import by.tishalovichm.yourmovieslist.entities.User;
import by.tishalovichm.yourmovieslist.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomUserDetailsService implements UserDetailsService {

    private final UsersService usersService;

    private final UserDetailsMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = usersService.getByLogin(username);
        return mapper.map(user);
    }
}
