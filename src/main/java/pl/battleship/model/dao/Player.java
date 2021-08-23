package pl.battleship.model.dao;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "player_id")
    private Long id;

    @CreationTimestamp
    @Column(name = "joined_at")
    private LocalDateTime join;

    @ManyToMany
    private Set<Game> games;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "winner")
    private Boolean winner = false;

}
