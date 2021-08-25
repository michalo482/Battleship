package pl.battleship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.battleship.model.dao.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
