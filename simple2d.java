import java.util.Scanner;

public class Simple2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][2];

        System.out.println("Enter 4 integers:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input! Please enter an integer:");
                    sc.next(); // skip wrong input
                }
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("You entered:");
        for (int[] row : array) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
