package pl.battleship.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.battleship.model.dao.User;
import pl.battleship.model.dto.UserDto;
import pl.battleship.service.UserService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createAccount(@RequestBody UserDto userDto){
        userService.createUser(userDto);
    }

//    @RequestMapping(value = "/userslist", method = RequestMethod.GET)
//    public void getPlayers() {
//        userService.listUsers();
//    }

//    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
//    public void getUser(){
//        userService.getUser();
//    }

}
