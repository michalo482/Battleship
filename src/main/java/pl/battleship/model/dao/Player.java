package pl.battleship.model.dao;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
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
    private Long id;

    // local date
    private Date join = new Date();

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Game> game;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

//    @ManyToOne(fetch = FetchType.EAGER)
//    private Set<Ship> fleets = new HashSet<Ship>();

//    @ManyToOne(fetch = FetchType.EAGER)
//    private Set<Shot> shots = new HashSet<Shot>();

    private Boolean winner = false;




}
