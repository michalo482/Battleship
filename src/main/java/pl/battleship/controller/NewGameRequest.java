package pl.battleship.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewGameRequest {

    private Long playerOneId;
    private Long playerTwoId;

}
