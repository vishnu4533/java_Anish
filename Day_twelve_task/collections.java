import java.util.*;
//
//public class collections {
//    public static void main(String[] args) {
//        //List l = new collections(); can't add because list is interface
//        ArrayList l = new ArrayList<>();
//        l.add(5335);
//        l.add("Dhanushkumar");
//        l.add("Nuclear Research Scientist");
//        System.out.println(l);
//
//        
//    }
//}
//
                            //remove method
//public class collections {
//    public static void main(String[] args) {
//        //List l = new collections(); can't add because list is interface
//        ArrayList l = new ArrayList<>();
//        l.add(5335);
//        l.add("Dhanushkumar");
//        l.add("Dhanushkumar");
//        l.add("Nuclear Research Scientist");
//        //l.remove(0);
//        //l.set(1, "Dhanushkumar CEO");
//        String s = (String) l.get(1);
//        System.out.println(l);
//        System.out.println(l.lastIndexOf("Dhanushkumar"));
//        System.out.println(l.size());
//        System.out.println(s);
//
//        
//    }
//}

// iterate the list

public class collections {
    public static void main(String[] args) {
        //List l = new collections(); can't add because list is interface
        ArrayList l = new ArrayList<>();
        l.add(5335);
        l.add("Dhanushkumar");
        l.add("Dhanushkumar");
        l.add("Nuclear Research Scientist");
        l.forEach(System.out::println);

        
    }
}