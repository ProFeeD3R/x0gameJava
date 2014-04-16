public class GameField {

    private static final int FIELD_SIZE = 3;
    private static final char DEFAULT_CELL_VALUE = ' ';
    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];
    private static final int X_PLAYER_ID = 1;
    private static final int O_PLAYER_ID = 2;


    public void eraseField(){
        for (int i = 0; i < FIELD_SIZE  ; i++){
            eraseLine(i);
        }

    }

    public void showField() {
        System.out.println();
        for (int i = 0; i < FIELD_SIZE; i++) {
            showLine(i);
        }

        System.out.println();
    }

    private void showCell(int i,int i2){
        System.out.print("[" + field[i][i2] + "]");
    }

    private void eraseLine(int lineNumber){
        for (int i = 0; i < FIELD_SIZE; i++){
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }
    private void showLine(int lineNumber){
        for (int i = 0; i < FIELD_SIZE; i++){
            showCell(i, lineNumber);
        }
        System.out.println();
    }

    public void fillCell(int columnNumber, int lineNumber, int player){
        if (field[columnNumber][lineNumber] == ' ') {
            if (player == X_PLAYER_ID) {
                field[columnNumber][lineNumber] = 'X';
            }
            else if (player == O_PLAYER_ID) {
                field[columnNumber][lineNumber] = 'O';
            }
            else {
                System.out.println("Incorrect player number!");
            }
        }

    }
}
