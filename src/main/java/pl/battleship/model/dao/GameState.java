package pl.battleship.model.dao;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class GameState {

    @Id
    private Long id;

    @OneToOne
    private Game game;

    // PLANSZE, ZAINICJOWAC STAN, STWORZYĆ PUSTA PLANSZĘ, KTÓRY ETAP
}
