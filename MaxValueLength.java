import java.util.Scanner;

public class MaxValueLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the count of numbers
        System.out.print("Enter how many numbers: ");
        int count = scanner.nextInt();

        int max = Integer.MIN_VALUE;

        // Read numbers and find max
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            if (num > max) {
                max = num;
            }
        }

        // Calculate length (number of digits)
        int length = String.valueOf(Math.abs(max)).length();

        System.out.println("Maximum Value: " + max);
        System.out.println("Length of Maximum Value: " + length);

        scanner.close();
    }
}
// max leve 