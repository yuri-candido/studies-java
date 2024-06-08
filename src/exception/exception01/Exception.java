package src.exception.exception01;

public class Exception {

    public static void main(String[] args) {

        try{
            int[] vetor = new int[4];

            System.out.println("Before the exception");

            vetor[4] = 1;

            System.out.println("This text will not be printed");
        } catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Exception when accessing a vector index that does not exist");
        }

        System.out.println("This text will be printed after the exception");
    }
}
