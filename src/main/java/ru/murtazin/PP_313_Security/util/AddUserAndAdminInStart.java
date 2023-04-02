package ru.murtazin.PP_313_Security.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.murtazin.PP_313_Security.model.Role;
import ru.murtazin.PP_313_Security.model.User;
import ru.murtazin.PP_313_Security.service.RoleService;
import ru.murtazin.PP_313_Security.service.UserService;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class AddUserAndAdminInStart {

//    private final RoleService roleService;
//    private final UserService userService;
//
//    @Autowired
//    public AddUserAndAdminInStart(RoleService roleService, UserService userService) {
//        this.roleService = roleService;
//        this.userService = userService;
//    }
//
//    @PostConstruct
//    public void startApp(){
//        Role adminRole=new Role("ROLE_ADMIN");
//        Role userRole=new Role("ROLE_USER");
//        roleService.saveRole(adminRole);
//        roleService.saveRole(userRole);
//
//        User admin=new User("admin","adminov","admin@mail.ru","admin", Set.of(adminRole,userRole));
//        userService.saveUser(admin);
//
//        User user=new User("user","userov","user@mail.ru","user",Set.of(userRole));
//        userService.saveUser(user);
//    }
}
