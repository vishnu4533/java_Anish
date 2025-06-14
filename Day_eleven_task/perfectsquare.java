import java.util.Scanner;
public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a perfect square: ");
        int number = sc.nextInt(); // Example number
        boolean isps = ps(number);
        if (isps) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
        sc.close();
    }

    public static boolean ps(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }
}
