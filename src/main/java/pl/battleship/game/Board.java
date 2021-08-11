package pl.battleship.game;

import java.util.Arrays;
import java.util.Random;

public class Board {

    public Board() {
    }

    public State[][] createBoard(int length, State water, State ship, int shipNumber) {
        State[][] board = new State[length][length];
         for (State[] row : board) {
             Arrays.fill(row, water);
         }
         return placeShips(board, shipNumber, water, ship, length);
    }

    public State[][] placeShips(State[][] board, int shipNumber, State water, State ship, int length) {
        int shipsPlaced = 0;
        while (shipsPlaced < shipNumber) {
            int[] placeHolder = generateShipCoordinates(length);
            State validField = board[placeHolder[0]][placeHolder[1]];
            if (validField == water) {
                board[placeHolder[0]][placeHolder[1]] = ship;
                shipsPlaced++;
            }
        }
        return board;
    }

    public int[] generateShipCoordinates(int length) {
        int[] coordinates = new int[2];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = new Random().nextInt(length);
        }
        return coordinates;
    }

    public void printBoard(State[][] board, State water, State ship) {
        int boardLength = board.length;
        System.out.print("  ");
        for (int i = 0; i < boardLength; i++){
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int row = 0; row < boardLength; row++) {
            // PAMIETAJ dodac 1 do userInput!!!!!!!!!!!!
            System.out.print(row + 1 + " ");
            for (int col = 0; col < boardLength; col++) {
                State position = board[row][col];
                if (position == ship) {
                    System.out.print(water + " ");
                } else {
                    System.out.print(position + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    }
