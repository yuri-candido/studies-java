package src.vectors.exercise03;

// program to print a grid.
public class Main {
    public static void main(String[] args) {

        String[] grid = new String[100];

        for(int i=0; i <= grid.length-1; i++) {
            grid[i] = "-";
        }

        for(int i=0; i <= grid.length-1; i++) {
            System.out.print(grid[i]);

            if(i == 9 || i==19 || i==29 || i==39 || i==49 || i==59 || i==69 || i==79 ||
                    i==89 || i==99) {
                System.out.println("\n");
            }
        }

    }
}
