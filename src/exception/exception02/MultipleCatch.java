package src.exception.exception02;

public class MultipleCatch {

    public static void main(String[] args) {

        int[] numbers = {4, 8, 16, 32, 64, 128};
        int[] denominator = {2, 0, 4, 8, 0};

        for (int i=0; i<numbers.length; i++){
            try{
                System.out.println(numbers[i] + "/" + denominator[i] + " = " + (numbers[i]/denominator[i]));
            }
            catch(ArithmeticException e){
                System.out.println("Error dividing by zero");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid array position");
            }
        }

    }
}
