package pl.battleship.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.battleship.model.dao.Game;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @PostMapping
    public Game createNewGame(@RequestBody NewGameRequest newGameRequest) {
    return null;
    }
}
