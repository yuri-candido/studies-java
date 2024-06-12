package src.exception.exception03;

public class Finally01 {

    public static void main(String[] args) {

        int[] numbers = {4, 8, 16, 32, 64, 128};
        int[] denominators = {2, 0, 4, 8, 0};

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + "/" + denominators[i] + " = " + (numbers[i] / denominators[i]));
            } catch (ArithmeticException e) {
                System.out.println("Error dividing by zero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array position");
            } finally {
                System.out.println("This line is always printed after the try or catch");
                System.out.println();
            }
        }
    }
}
