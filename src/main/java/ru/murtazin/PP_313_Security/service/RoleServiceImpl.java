package ru.murtazin.PP_313_Security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.murtazin.PP_313_Security.model.Role;
import ru.murtazin.PP_313_Security.repository.RoleRepository;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    @Override
    public void saveRole(Role savedRole) {
        roleRepository.save(savedRole);
    }
}
