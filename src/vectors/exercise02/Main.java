package src.vectors.exercise02;

import java.util.Scanner;

//program to sum values of an array
public class Main {
    public static void main (String[] args){

        int addNumber;
        int sum = 0;
        int numbers[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<= numbers.length-1; i++) {
            System.out.println("Type a int number:");
            addNumber = scanner.nextInt();
            numbers[i] = addNumber;
            sum = sum + numbers[i];
        }

        System.out.println("The sum of the numbers is: " + sum);

    }
}
