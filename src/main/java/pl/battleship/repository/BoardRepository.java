package pl.battleship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.battleship.model.dao.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
