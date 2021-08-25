package pl.battleship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.battleship.model.dao.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
