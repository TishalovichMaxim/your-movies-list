package by.tishalovichm.yourmovieslist.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    //@Bean
    //SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    //    //http.authorizeHttpRequests(c -> c.anyRequest().permitAll());
    //    //http.csrf(c -> c.disable());
    //    return http.build();
    //}

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
