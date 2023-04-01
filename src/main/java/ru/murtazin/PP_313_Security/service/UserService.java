package ru.murtazin.PP_313_Security.service;

import ru.murtazin.PP_313_Security.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByName(String name);

    void updateUser(User user, Long id);

    void removeUserById(Long id);

}
