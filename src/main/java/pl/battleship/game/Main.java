package pl.battleship.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        State water = State.WATER;
        State ship = State.SHIP;
        State hit = State.HIT;
        State miss = State.MISS;

        int length = 4;
        int shipNumber = 4;

        Board gameBoard = new Board();
        State[][] placeHolder = gameBoard.createBoard(length, water, ship, shipNumber);
        gameBoard.printBoard(placeHolder, water, ship);

        int hidenShipNumbrer = shipNumber;
        while (hidenShipNumbrer > 0) {
            int[] shotCoordinates = userInput(length);
            State fieldUpdate = evaluateShot(shotCoordinates, placeHolder, ship, water, miss, hit);
            if (fieldUpdate == hit ) {
                hidenShipNumbrer--;
            }
            placeHolder = updateGameBoard(placeHolder, shotCoordinates, fieldUpdate);
            gameBoard.printBoard(placeHolder, water, ship);
        }

    }

    private static State[][] updateGameBoard(State[][] placeHolder, int[] shotCoordinates, State fieldUpdate) {
        int row = shotCoordinates[0];
        int col = shotCoordinates[1];

        placeHolder[row][col] = fieldUpdate;
        return placeHolder;
    }

    private static State evaluateShot(int[] shotCoordinates, State[][] placeHolder, State ship, State water, State miss, State hit) {

        String message;

        int row = shotCoordinates[0];
        int col = shotCoordinates[1];

        State target = placeHolder[row][col];
        if (target == ship) {
            message = "HIT!";
            target = hit;
        } else if (target == water) {
            message = "MISS!";
            target = miss;
        } else {
            message = "Try again";
        }
        System.out.println(message);
        return target;
    }

    private static int[] userInput(int length) {
        int row;
        int col;
        do {
            System.out.println("Row: ");
            row = new Scanner(System.in).nextInt();
        } while (row < 0 || row > length + 1);
        do {
            System.out.println("Column: ");
            col = new Scanner(System.in).nextInt();
        } while (col <0 || col > length + 1);
        return new int[] {row -1, col -1};
    }
}
