package src.objectOrientation.exercise01.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Hash hash = new Hash();

        System.out.println("Player 1 = X");
        System.out.println("Player 2 = O");

        boolean win = false;
        char signal;
        int row = 0, column = 0;



        while (!win) {

            if (hash.playerTurn1()) {

                System.out.println("Player turn 1. Choose row and column (1-3).");
                signal = 'X';
            } else {

                System.out.println("Player turn 2. Choose row and column (1-3).");
                signal = 'O';
            }

            row = value("Row", scan);
            column = value("Column", scan);

            if (!hash.validateMove(row, column, signal)){
                System.out.println("Position already used, try again");
            }

            hash.printBoard();

            if (hash.checkWinner('X')){
                win = true;
                System.out.println("Congratulations, player 1 won!");
            } else if (hash.checkWinner('O')){
                win = true;
                System.out.println("Congratulations, player 2 won!!");
            } else if (hash.move > 9){
                win = true;
                System.out.println("Nobody won this match.");
            }
        }
    }

    static int value(String typevalue, Scanner scan) {
        int value = 0;
        boolean validValue = false;
        while (!validValue) {
            System.out.println("Enter with a " + typevalue + " (1, 2 ou 3)");
            value = scan.nextInt();
            if (value >= 1 && value <= 3) {
                validValue = true;
            } else {
                System.out.println("Invalid input, please try again");
            }
        }
        value--;
        return value;
    }
}

