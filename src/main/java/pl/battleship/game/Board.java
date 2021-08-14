package pl.battleship.game;

public class Board {

    private int length;
    Field[][] matrix;

    public Board(int length) {
        this.length = length;
        fillBoard(length);
    }

    public int getLength() {
        return length;
    }

    public Field getField(int x, int y) {
        return matrix[x][y];
    }

    public Field[][] fillBoard(int length) {
        matrix = new Field[length][length];
        for (int row = 0; row < length; row++) {
            for(int col = 0; col < length; col++) {
                matrix[row][col] = new Field(row, col, State.WATER);
            }
        }
        return matrix;
    }

    public void placeShip(Field field, Ship ship) {

        int x;
        int y;

        switch (ship.getShipType().size) {
            case 1:
                field.setFieldState(State.SHIP);
                ship.addFieldToShip(field);
                break;
            case 2:
                field.setFieldState(State.SHIP);
                ship.addFieldToShip(field);
                x = field.getX();
                y = field.getY();
                ship.addFieldToShip(new Field(x, y +1, State.SHIP));
                break;
            case 3:
                field.setFieldState(State.SHIP);
                ship.addFieldToShip(field);
                x = field.getX();
                y = field.getY();
                ship.addFieldToShip(new Field(x, y +1, State.SHIP));
                ship.addFieldToShip(new Field(x, y +2, State.SHIP));
                break;
            case 4:
                field.setFieldState(State.SHIP);
                ship.addFieldToShip(field);
                x = field.getX();
                y = field.getY();
                ship.addFieldToShip(new Field(x, y +1, State.SHIP));
                ship.addFieldToShip(new Field(x, y +2, State.SHIP));
                ship.addFieldToShip(new Field(x, y +3, State.SHIP));
                break;
            case 5:
                field.setFieldState(State.SHIP);
                ship.addFieldToShip(field);
                x = field.getX();
                y = field.getY();
                ship.addFieldToShip(new Field(x, y +1, State.SHIP));
                ship.addFieldToShip(new Field(x, y +2, State.SHIP));
                ship.addFieldToShip(new Field(x, y +3, State.SHIP));
                ship.addFieldToShip(new Field(x, y +4, State.SHIP));
                break;
        }
    }
}
