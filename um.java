import java.util.Scanner;
public class um {

 public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the number:");
    int n = sc.nextInt();
    int a = n/10;
    int b = n%10;
    System.out.println(a+b);
 }    
}