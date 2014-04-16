
public class Main {

    public static void main(String[] args) {

        GameField gameField = new GameField();
        gameField.eraseField();
        gameField.showField();
        for (int i = 0; i < 3; i++){
            for (int i2 = 0; i2 < 3; i2++){
                gameField.fillCell(i,i2,2);
                gameField.showField();
            }
        }
    }
}
