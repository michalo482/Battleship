package pl.battleship.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.battleship.exception.EntityAlreadyExistsException;
import pl.battleship.UserMapper;
import pl.battleship.model.dao.User;
import pl.battleship.model.dto.UserDto;
import pl.battleship.repository.UserRepository;

@RequiredArgsConstructor
@Transactional
@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto createUser(UserDto userDto){

        if(userRepository.countAllByMailOrUsername(userDto.getMail(), userDto.getUsername()) > 0 ){
            throw new EntityAlreadyExistsException("Mail or username already taken");
        }

        User user = userMapper.map(userDto);
        userRepository.save(user);
        return userMapper.map(user);
    }

//    public User getUser(String username){
//        userRepository.findById(username);
//    }


}
