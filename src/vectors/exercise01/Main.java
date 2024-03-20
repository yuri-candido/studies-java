package src.vectors.exercise01;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)   {

        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        String names[] = new String[5];
        int numbers[] = new int[5];


        for (String name : names) {

            System.out.println("Enter a name for the list");
            String addName = scanner.next();
            names[counter] = addName;
            counter += 1;

            if (counter == 5) {
                counter = 0;
            }
        }

        for (int number : numbers) {

            System.out.println("Enter a number for the list:");
            int addNumber = scanner.nextInt();
            numbers[counter] = addNumber;
            counter += 1;
        }

        scanner.close();

        Arrays.sort(names);
        Arrays.sort(numbers);

        for (String name : names) {
            System.out.println(name);
        }

        for(int number : numbers){
            System.out.println(number);
        }

    }

}
