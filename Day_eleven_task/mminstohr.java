import java.util.Scanner;
public class mminstohr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minutes to convert: ");
        int mins = sc.nextInt();
        double hrs = (double) mins / 60;
        System.out.println("The total hours for the give minutes is: " + hrs + " hours");
        sc.close();
    }
    
}
