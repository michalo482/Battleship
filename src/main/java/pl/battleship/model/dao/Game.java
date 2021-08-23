package pl.battleship.model.dao;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreationTimestamp
    private LocalDateTime creationDate;


    @OneToOne
    private GameState gameState;

    @ManyToMany(mappedBy = "game", fetch = FetchType.EAGER)
    private Set<Player> players = new HashSet<>();


//    @OneToMany(mappedBy = "game", fetch = FetchType.EAGER)
//    private Set<Score> scores = new HashSet<>();

    private Boolean finished = false;


}
