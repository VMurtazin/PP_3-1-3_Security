package ru.murtazin.PP_313_Security.service;

import ru.murtazin.PP_313_Security.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getRoles();

    void saveRole(Role savedRole);
}
