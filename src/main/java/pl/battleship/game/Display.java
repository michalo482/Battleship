package pl.battleship.game;

public class Display {


    public void printBoard(Board board) {

        int boardLength = board.getLength();
        System.out.print("  ");
        for (int i = 0; i < boardLength; i++){
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int row = 0; row < boardLength; row++) {
            System.out.print(row + 1 + " ");
            for (int col = 0; col < boardLength; col++) {
                Field field = board.getField(row, col);
                switch (field.fieldRepresentation()) {
                    case '~':
                        System.out.print('~' + " ");
                        break;
                    case 'x':
                        System.out.print('x' + " ");
                        break;
                    case 'o':
                        System.out.print('o' + " ");
                        break;
                    case 's':
                        System.out.print('s' + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
