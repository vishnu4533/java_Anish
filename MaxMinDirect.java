
import java.nio.Buffer;

public class MaxMinDirect {
    public static void main(String[] args) {
        // Predefined array of numbers,
        int[] numbers = {45, 12, 78, -34, 123, 0};

        int max = numbers[0];
        int min = numbers[0];

        // Find max and min
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        // Length of max and min (number of digits)
        int maxLength = String.valueOf(Math.abs(max)).length();Buffer

        int minLength = String.valueOf(Math.abs(min)).length();

        // Print results
        System.out.println("Maximum Value: " + max);
        System.out.println("Length of Maximum Value: " + maxLength);

        System.out.println("Minimum Value: " + min);
        System.out.println("Length of Minimum Value: " + minLength);
    }
}
