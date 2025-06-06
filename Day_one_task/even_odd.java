import java.util.Scanner;
public class even_odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER A NUMBER TO CHECK WHETHER IT IS ODD OR EVEN : ");
        int a = sc.nextInt();
        if(a % 2 == 0) {
            System.out.println("THE GIVEN NUMBER "+ a + " IS EVEN");
        }else {
            System.out.println("THE GIVEN NUMBER "+ a + " IS ODD");
        }
        sc.close();
    }
}