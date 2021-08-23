package pl.battleship.model.dao;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Shot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int turn;


}
