package ru.murtazin.PP_313_Security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.murtazin.PP_313_Security.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
