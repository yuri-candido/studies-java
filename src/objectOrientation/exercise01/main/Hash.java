package src.objectOrientation.exercise01.main;

public class Hash {
    char[][] hash = new char[3][3];
    int move = 1;

    boolean validateMove(int line, int column, char signal) {

        if (hash[line][column] == 'X' || hash[line][column] == 'O') {
            return false;

        } else { //move válida
            hash[line][column] = signal;
            move++;
            return true;
        }
    }

    void printBoard() {
        for (int i = 0; i < hash.length; i++) {
            for (int j = 0; j < hash[i].length; j++) {
                System.out.print(hash[i][j] + " | ");
            }
            System.out.println();
        }
    }

    boolean checkWinner(char signal) {
        if ((hash[0][0] == signal && hash[0][1] == signal && hash[0][2] == signal) || //line 1
                (hash[1][0] == signal && hash[1][1] == signal && hash[1][2] == signal) || //line 2
                (hash[2][0] == signal && hash[2][1] == signal && hash[2][2] == signal) || //line 3
                (hash[0][0] == signal && hash[1][0] == signal && hash[2][0] == signal) || //column 1
                (hash[0][1] == signal && hash[1][1] == signal && hash[2][1] == signal) || //column 2
                (hash[0][2] == signal && hash[1][2] == signal && hash[2][2] == signal) || //column 3
                (hash[0][0] == signal && hash[1][1] == signal && hash[2][2] == signal) || //diagonal
                (hash[0][2] == signal && hash[1][1] == signal && hash[2][0] == signal)) {  //diagonal inversa
            return true;
        }
        return false;
    }

    boolean playerTurn1(){
        if (move % 2 == 1){
            return true;
        }
        return false;
    }
}
