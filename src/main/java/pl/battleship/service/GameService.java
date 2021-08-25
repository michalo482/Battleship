package pl.battleship.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.battleship.controller.NewGameRequest;
import pl.battleship.model.dao.Game;
import pl.battleship.model.dao.User;
import pl.battleship.repository.GameRepository;
import pl.battleship.repository.PlayerRepository;
import pl.battleship.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class GameService {

    private final GameRepository gameRepository;
    private final PlayerRepository playerRepository;
    private final UserRepository userRepository;

    public Game createNewGame(NewGameRequest newGameRequest) {
        // stworzyc obiekt game, pobrać graczy o id, sprawdzić czy istnieją, game state
        User user = userRepository.findById(newGameRequest.getUserId()).orElseThrow();
        // stworzyc playera połączyć z userem, stworzyc 4 boardy, odpowiednie boardFieldy, stany boardFieldu, game state
        
        playerRepository.findById(newGameRequest.getUserId());
//        playerRepository.findById(newGameRequest.getPlayerTwoId());
        Game game = new Game();
//        game.setPlayers();
//        game.setGameState();
        return gameRepository.save(game);
    }
}
