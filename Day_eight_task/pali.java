package Day_eight_task;

public class pali {
    public static void main(String[] args) {
        StringBuffer st = new StringBuffer("madam");
        String s1 = st.toString();
        String n = st.reverse().toString();
        if (s1.equals(n)) {
            System.out.println("is a palindrome ");
        } else {
            System.out.println("not ");
        }

    }
}
