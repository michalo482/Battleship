package pl.battleship.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.battleship.exception.EntityAlreadyExistsException;
import pl.battleship.UserMapper;
import pl.battleship.model.dao.User;
import pl.battleship.model.dto.UserDto;
import pl.battleship.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public void createUser(UserDto userDto){

        if(userRepository.countAllByMailOrUsername(userDto.getMail(), userDto.getUsername()) > 0 ){
            throw new EntityAlreadyExistsException("Mail or username already taken");
        } else {

            User user = userMapper.map(userDto);
            userRepository.save(user);
        }
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

}
