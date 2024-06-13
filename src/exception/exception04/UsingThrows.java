package src.exception.exception04;

import java.util.Scanner;

public class UsingThrows {

    public static void main(String[] args) {

        System.out.println("Enter a decimal number");
        try {
            double num = readNumber();
            System.out.println("You typed " + num);
        } catch (Exception e) {
            System.out.println("Invalid Input");
            e.printStackTrace();
        }

    }

    public static double readNumber() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
