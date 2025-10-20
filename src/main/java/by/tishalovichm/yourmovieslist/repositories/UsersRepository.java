package by.tishalovichm.yourmovieslist.repositories;

import by.tishalovichm.yourmovieslist.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long> {
    User findByLogin(String login);
}
