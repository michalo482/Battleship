package pl.battleship.auth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.battleship.model.dto.UserDto;
import pl.battleship.service.UserService;

import javax.annotation.PostConstruct;

//@Component
public class AdminUserInitializer {

//    private UserService userService;
//    private PasswordEncoder passwordEncoder;
//    private String username;
//    private String password;
//
//    public AdminUserInitializer(
//            UserService userService,
//            PasswordEncoder passwordEncoder,
//            @Value("${spring.security.user.name:admin}") String username,
//            @Value("${spring.security.user.password:admin}") String password
//    ) {
//        this.userService = userService;
//        this.passwordEncoder = passwordEncoder;
//        this.username = username;
//        this.password = password;
//    }
//
//    @PostConstruct
//    public void initDefaultUser() {
//        final UserDto user = new UserDto();
//        user.setUsername(username);
//        user.setPassword(passwordEncoder.encode(password));
//        user.setRole("ADMIN");
//        userService.createUser(user);
//    }

}
