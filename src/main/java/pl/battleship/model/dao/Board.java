package pl.battleship.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(exclude = "boardFields")
public class Board {

    @Id
    private Long id;

    @OneToMany
    @JoinColumn(name="board_id")
    private Set<BoardField> boardFields = new HashSet<>();

    @ManyToOne
    private Game game;

    //
}
