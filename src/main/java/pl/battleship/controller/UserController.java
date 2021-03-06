package pl.battleship.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import pl.battleship.model.dao.User;
import pl.battleship.model.dto.UserDto;
import pl.battleship.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public UserDto createAccount(@RequestBody UserDto userDto){
        userService.createUser(userDto);
        return userDto;
    }

    @GetMapping
    public List<UserDto> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/register")
    public String getRegPage(Model model) {
        model.addAttribute("registerRequest", new UserDto());
        return "register";
    }

    @GetMapping("/login")
    public String getLoginPage(ModelMap model) {
        model.addAttribute("loginRequest", new UserDto());
        return "login";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserDto user) {
        UserDto registeredUser = userService.createUser(user);
        return registeredUser == null ? "error_page" : "redirect:/users/login";
    }


//    Game newGame = new Game();
//    Player newPlayer = getLoggedPlayer(authentication);
//    GamePlayer newGamePlayer = new GamePlayer(newGame, newPlayer);
//            gameRepository.save(newGame);
//            gamePlayerRepository.save(newGamePlayer);
//            return new ResponseEntity<>(createMap("gpid", newGamePlayer.getId()), HttpStatus.CREATED);
}
