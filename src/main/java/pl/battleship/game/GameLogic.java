package pl.battleship.game;

import java.util.ArrayList;
import java.util.List;

public class GameLogic {

    private List<Ship> fleetPlayerOne = new ArrayList<>();
    private List<Ship> fleetPlayerTwo = new ArrayList<>();
    List<Board> boards;

    public void logic() {
        Input board1 = new Input();
        boards = board1.getBoards();
        Board boardPlayerOne = boards.get(0);
        Board boardPlayerTwo = boards.get(1);
        for (int i = 0; i < 1; i++) {
            Ship one = board1.createShip(0);
            while (!one.placementValid(one, fleetPlayerOne, boardPlayerOne)) {
                one = board1.createShip(0);
            }
            fleetPlayerOne.add(one);
        }
        for (int i = 0; i < 1; i++) {
            Ship two = board1.createShip(1);
            while (!two.placementValid(two, fleetPlayerOne, boardPlayerTwo)) {
                two = board1.createShip(1);
            }
            fleetPlayerTwo.add(two);
        }
        Player player1 = new Player(fleetPlayerOne, boardPlayerTwo);
        Player player2 = new Player(fleetPlayerTwo, boardPlayerOne);
        boolean gameOn = true;
        Display display = new Display();
        System.out.println("-------Player one--------");
        display.printBoard(boardPlayerOne);
        System.out.println("-------------------------");
        System.out.println("-------Player two--------");
        display.printBoard(boardPlayerTwo);
        int playerOneLife = player1.hitPointsOfFleet(fleetPlayerOne);
        int playerTwoLife = player2.hitPointsOfFleet(fleetPlayerTwo);
        while (gameOn) {
            int[] shootCoords;
            shootCoords = board1.shoot(0);
            if (player2.shotsHandler(shootCoords[0], shootCoords[1])) {
                display.printBoard(player2.getBoard());
                playerTwoLife--;
            } else {
                display.printBoard(player2.getBoard());
            }
            if (playerTwoLife == 0) {
                display.printBoard(player2.getBoard());
                System.out.println("player 1 wins");
                break;
            }
            shootCoords = board1.shoot(1);
            if (player1.shotsHandler(shootCoords[0], shootCoords[1])) {
                display.printBoard(player1.getBoard());
                playerOneLife--;
            } else {
                display.printBoard(player1.getBoard());
            }
            if (playerOneLife == 0) {
                display.printBoard(player1.getBoard());
                System.out.println("player 2 wins");
                break;
            }
        }
    }


}
