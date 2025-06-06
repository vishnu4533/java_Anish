import java.lang.management.OperatingSystemMXBean;
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt(
        int[][] array = new int[rows][cols];

        // Input values for the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();

    }
}
///
/// 
///i 
interface  hr{

    puplic void display(){
        System.out.println("budget from finance")
    }
}
class office extends legal_office implements hr,finance,Operati
public class abst {

    public static void main(String[] args) {
        public static void main strings 
    }
}