package pl.battleship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.battleship.model.dao.GameState;

public interface GameStateRepository extends JpaRepository<GameState, Long> {
}
