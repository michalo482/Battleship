package pl.battleship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.battleship.model.dao.User;
import pl.battleship.model.dto.UserDTO;
import pl.battleship.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User createAccount(@RequestBody UserDTO userDTO){
        User user = userService.createUser(userDTO);
        return user;
    }

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public void getUser(){
        userService.getUser();
    }

}
