package pl.battleship;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;
import pl.battleship.model.dao.User;
import pl.battleship.model.dto.UserDto;

@RequiredArgsConstructor
@Component
public class UserMapper {

//    private final PasswordEncoder passwordEncoder;

    public UserDto map(User user) {
        return UserDto.builder()
                .username(user.getUsername())
                .mail(user.getMail())
                .role(user.getRole())
                .build();
    }

    public User map(UserDto userDto) {
        return User.builder()
                .username(userDto.getUsername())
                .mail(userDto.getMail())
                .role(userDto.getRole())
                .password(userDto.getPassword())
                .build();
    }
}
