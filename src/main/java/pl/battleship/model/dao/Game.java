package pl.battleship.model.dao;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;


import javax.persistence.*;
import java.time.LocalDateTime;
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
    @Column(name = "game_id")
    private Long id;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime creationDate;

    @ManyToMany
    private Set<Player> players = new HashSet<>();

    @Column(name = "finished")
    private Boolean finished = false;

}
