import java.util.*;
                    // HashMap Example
// public class hi {
//     public static void main(String[] args) {
//         Map <Integer, String> player = new HashMap<Integer,String>();
//         player.put(7, "Dhoni");
//         player.put(18, "kohli");   
//         player.put(23, "Rohit");
//         player.put(8, "Jadeja");
//         player.put(96, "Hardik");
//         player.put(35, "Raina");
        
//         System.out.println(player);


//         // player.remove(96, "Hardik");
//         // player.putIfAbsent(27, "Not Found");

//         // System.out.println(player.get(8));
//         System.out.println(player);
//         System.out.println(player.size());
//         System.out.println(player.containsKey(23));
//         System.out.println(player.containsValue("Rohit"));

//         System.out.println(player.isEmpty());
//         System.out.println(player.keySet());
//         System.out.println(player.values());
//         // System.out.println(player.getOrDefault(23, "Not Found"));


//     }
// }

                    //TreeMap Example
public class hi {
    public static void main(String[] args) {
        Map <Integer, String> player = new TreeMap<Integer,String>();
        player.put(7, "Dhoni");
        player.put(18, "kohli");   
        player.put(23, "Rohit");
        player.put(8, "Jadeja");
        player.put(96, "Hardik");
        player.put(35, "Raina");
        
        System.out.println(player);


        // player.remove(96, "Hardik");
        // player.putIfAbsent(27, "Not Found");

        // System.out.println(player.get(8));
        System.out.println(player);
        System.out.println(player.size());
        System.out.println(player.containsKey(23));
        System.out.println(player.containsValue("Rohit"));

        System.out.println(player.isEmpty());
        System.out.println(player.keySet());
        System.out.println(player.values());
        // System.out.println(player.getOrDefault(23, "Not Found"));


    }
}