//public class doublenumber {
//
//    public static void main(String[] args) {
//        int number = 5;
//        int doubled = doubleNumber(number);
//        System.out.println("The double of " + number + " is: " + doubled);
//    }
//
//    public static int doubleNumber(int num) {
//        return num * 2;
//    }
//}

import java.util.Scanner;
public class doublenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to double: ");
        int number = sc.nextInt();
        double doubled = (double) number;
        System.out.println("The double of " + number + " is: " + doubled);
        sc.close();
    }
}