package Day_seven_task;
import java.util.*;

public class handcricket{
    static int Player(Scanner sc){
        System.out.print("Player: ");
        int z = sc.nextInt();
        return z;
    }

    static int CPU() {
        int z = (int)(Math.random()*6)+1;
        System.out.println("CPU: " + z);
        return z;
    }
    public static void main(String[] args) {
        int Tscore = 0;
        int score = 0;
        int cpu = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            score = Player(sc);
            cpu = CPU();
            if(score != cpu){
                Tscore += score;
            }
            else {
                System.out.println("Total Score: " + Tscore);
                break;
            }
        }
        sc.close();
    }
}