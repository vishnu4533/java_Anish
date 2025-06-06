package Day_six_task;
/* 
public class string {
    public static void main(String[] args) {
        String s = "The String";
        String s1 = new String("The String");
        System.out.println(s.equals(s1));
    }
}*/
/* 
public class string {
    public static void main(String[] args) {
        String s = "The String";
        String s1 = new String("The Strng");
        System.out.println(s.contentEquals(s1));
    }
}*/
/* 
public class string {
    public static void main(String[] args) {
        String s = "The String";
        String s1 = new String("The String");
        System.out.println(s1.repeat(5));
    }
}
*/

/* 
public class string{
    public static void main(String[] args) {
        for (int i=1; i<8; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
*/

//public class string{
//    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        for (int j: arr)
//        {
//            System.out.println(j);
//        }
//    }
//}

public class string{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("this is string and ");
        sb.append("this");
        sb.append(" ");
        sb.append("can be mutable");
        sb.append("!");
        sb.insert(0, "Hello ");
        sb.reverse();
        
        System.out.println(sb);
    }
}