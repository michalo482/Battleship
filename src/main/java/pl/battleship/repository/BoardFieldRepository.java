package pl.battleship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.battleship.model.dao.BoardField;

public interface BoardFieldRepository extends JpaRepository<BoardField, Long> {
}
