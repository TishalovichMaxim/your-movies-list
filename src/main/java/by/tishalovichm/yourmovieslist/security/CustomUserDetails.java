package by.tishalovichm.yourmovieslist.security;

import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Setter
public class CustomUserDetails implements UserDetails {

    private String username;

    private String passwordHash;

    private String roleName;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(() -> roleName);
    }

    @Override
    public String getPassword() {
        return passwordHash;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
