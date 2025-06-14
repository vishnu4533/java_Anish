import java.util.Scanner;
public class ntables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int m = 0;
        for (int i = 1; i <= 20; i++){
            m = n * i;
            System.out.println(n+ " x " +i+ " = " + m);

        } 
        sc.close();
    }
}
