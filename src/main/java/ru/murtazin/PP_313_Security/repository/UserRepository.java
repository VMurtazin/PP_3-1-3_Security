package ru.murtazin.PP_313_Security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.murtazin.PP_313_Security.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User getUserByUsername(String name);

}
