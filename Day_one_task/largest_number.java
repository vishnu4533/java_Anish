import java.util.Scanner;
public class largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int a = sc.nextInt();
        System.out.println("ENTER A NUMBER :");
        int b = sc.nextInt();
        System.out.println("ENTER A NUMBER :");
        int c = sc.nextInt();
        int temp = 0;
        if(a > b) {
            if(a > c) {
                temp = a ;
            } 
        }else if (b > c ) {
            if(b > c) {
                temp = b ;
            }
        }else {
            temp = c ;
        }
        System.out.println(temp + " IS  THE GREATEST NUMBER ");
        sc.close();

    }
    
}
