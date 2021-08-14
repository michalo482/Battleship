package pl.battleship.game;

import java.util.List;

public class Player {

    private List<Ship> fleet;
    private Board board;
    private int remaningLife = 0;

    public Player(List<Ship> fleet, Board board) {
        this.fleet = fleet;
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public int hitPointsOfFleet(List<Ship> fleet) {
        int sumOfFields = 0;
        for (Ship ship : fleet) {
            sumOfFields += ship.getShipType().size;
        }
        return sumOfFields;
    }

    public boolean shotsHandler(int x, int y) {
        for (Ship ship : fleet) {
            for(Field field : ship.getNewShip()) {
                if (field.getX() == x && field.getY() == y && field.getFieldState().equals(State.SHIP)) {
                    field.setFieldState(State.HIT);
                    board.getField(x, y).setFieldState(State.HIT);
                    System.out.println("Hit!");
                    return true;
                } else if (field.getX() == x && field.getY() == y && field.getFieldState().equals(State.HIT)) {
                    field.setFieldState(State.HIT);
                    board.getField(x, y).setFieldState(State.HIT);
                    System.out.println("Already hit!");
                    return false;
                }
            }
        }
        board.getField(x, y).setFieldState(State.MISS);
        System.out.println("Miss!");
        return false;
    }
}
