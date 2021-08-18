package pl.battleship.service;

import org.springframework.stereotype.Service;
import pl.battleship.model.dao.User;
import pl.battleship.model.dto.UserDTO;
import pl.battleship.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(UserDTO userDTO){
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setMail(userDTO.getMail());
        user.setPassword(userDTO.getPassword());
        userRepository.save(user);
        return user;
    }

    public User getUser(){
    }


}
