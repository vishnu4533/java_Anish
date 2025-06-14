import java.util.*;

class Order{
    String orderID;
    String CustomerName;
    public Order(String orderID, String CustomerName){
        this.orderID= orderID;
        this.CustomerName = CustomerName;
    }
}
public class FooddeliveryApp {
    public static void main(String[] args) {
        Queue<Order> foodOrders = new LinkedList<>();


        foodOrders.add(new Order("ORD101", "Bruce Wayne"));
        foodOrders.add(new Order("ORD102", "John wick"));
        foodOrders.add(new Order("ORD103", "James Bond"));
        foodOrders.add(new Order("ORD104", "Tony Stark"));
        foodOrders.add(new Order("ORD105", "Peter Parker"));
        foodOrders.add(new Order("ORD106", "Clark Kent"));
        foodOrders.add(new Order("ORD107", "Thalapathy Vijay"));
        foodOrders.add(new Order("ORD108", "Samantha Ruth Prabhu"));
        foodOrders.add(new Order("ORD109", "Dhanush"));
        foodOrders.add(new Order("ORD110", "Ajith Kumar"));


        while (!foodOrders.isEmpty()) {
            Order Currentorder = foodOrders.poll();
            System.out.println("Processing order: " + Currentorder.orderID + " for customer: " + Currentorder.CustomerName);
            for (int i = 0; i < 10; i++) {
                try {Thread.sleep(100);}
                catch (Exception e) {}
                System.out.print(".");

            }
        }
        System.out.println("ALL The Order has been Processed");
    }
}
