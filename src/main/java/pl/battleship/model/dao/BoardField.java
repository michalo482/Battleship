package pl.battleship.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardField {

    @Id
    private Long id;

    private String x;
    private String y;

    @ManyToOne
    private Board board;

    private boolean isOccupied;




}
