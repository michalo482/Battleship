package pl.battleship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.battleship.game.GameLogic;

@SpringBootApplication
public class BattleshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(BattleshipApplication.class, args);

        GameLogic game = new GameLogic();
        game.logic();
    }

}



