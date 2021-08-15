package pl.battleship.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    private List<Board> boards = new ArrayList<Board>();
    int size;
    List<Integer> shipTypeAndCoords = new ArrayList<>();

    public List<Board> getBoards() {
        createBoard();
        return boards;
    }

    public void createBoard() {
        System.out.println("Select board size: ");
        size = scanner.nextInt();
        Board board1 = new Board(size);
        Board board2 = new Board(size);
        boards.add(board1);
        boards.add(board2);
    }

    public Input() {
    }

    private List<Integer> askShipCoordsAndType() {
        this.shipTypeAndCoords = new ArrayList<>();
        System.out.println("Select row of start of a ship: ");
        int row = scanner.nextInt() - 1;
        System.out.println("Select col of start of a ship: ");
        int col = scanner.nextInt() - 1;
        System.out.println("Select ship type: ");
        int shipType = scanner.nextInt();
        shipTypeAndCoords.add(row);
        shipTypeAndCoords.add(col);
        shipTypeAndCoords.add(shipType);
        return shipTypeAndCoords;
    }

    public Ship createShip(int player) {
        int gamePlayer = player + 1;
        Field shipStart;
        Ship ship;
        System.out.println("Player" + gamePlayer + " place ship");
        shipTypeAndCoords = askShipCoordsAndType();
        int row = shipTypeAndCoords.get(0);
        int col = shipTypeAndCoords.get(1);
        int shipType = shipTypeAndCoords.get(2);
        shipStart = new Field(row, col, State.SHIP);
        ship = new Ship(new ArrayList<>(), ShipType.values()[shipType - 1]);
        boards.get(player).placeShip(shipStart, ship);
        return ship;
    }

    public int[] shoot(int player) {
        int gamePlayer = player +1;
        Board gameBoard = new Board(size);
        int row;
        int col;
        System.out.println("Player" + gamePlayer + " shoot");
        do {
            System.out.println("Row: ");
            row = new Scanner(System.in).nextInt();
        } while (row < 0 || row > gameBoard.getLength() + 1);
        do {
            System.out.println("Column: ");
            col = new Scanner(System.in).nextInt();
        } while (col < 0 || col > gameBoard.getLength() + 1);
        return new int[] {row -1, col -1};
    }
}
