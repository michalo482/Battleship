package pl.battleship.game;

public class Field {

    private int x;
    private int y;

    private State fieldState;

    public Field(int x, int y, State fieldState) {
        this.x = x;
        this.y = y;
        this.fieldState = fieldState;
    }

    public void setFieldState(State fieldState) {
        this.fieldState = fieldState;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public State getFieldState() {
        return fieldState;
    }

    public char fieldRepresentation() {
        char result = ' ';

        switch (fieldState) {
            case WATER:
                result = '~';
                break;
            case HIT:
                result = 'x';
                break;
            case MISS:
                result = 'o';
                break;
            case SHIP:
                result = 's';
                break;
        }
        return result;
    }
}
