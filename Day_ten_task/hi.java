package Day_ten_task;
//                          /* Multiple inheritance */
//interface hr {
//    //data member
//    int a = 10;
//    //member method
//    void display();
//}
//
//interface finance {
//    void budget();
//}
//
//interface operation {
//    void sop();
//}
//
//class office implements hr, finance, operation {
//    public void display() {
//        System.out.println("This is data member of interface hr: " + a);
//    }
//    public void budget() {
//        System.out.println("This is budget from finance interface ");
//    }
//    public void sop() {
//        System.out.println("This is budget from operation interface ");
//    }    
//}
//
//
//public class hi {
//    public static void main(String[] args) {
//        office o = new office();
//        o.display();
//        o.budget();
//        o.sop();
//    }
//}

interface hr {
    //data member
    int a = 10;
    //member method
    void display();
}

interface finance {
    void budget();
}

interface operation {
    void sop();
}
class legal{
    int a1 = 10;
    void law(){
        System.out.println("Indian Laws: "+ (++a1));
    }
}
class office extends legal implements hr, finance, operation {
    public void display() {
        System.out.println("This is data member of interface hr: " + a);
    }
    public void budget() {
        System.out.println("This is budget from finance interface ");
    }
    public void sop() {
        System.out.println("This is budget from operation interface ");
    }    
}


public class hi {
    public static void main(String[] args) {
        office o = new office();
        o.display();
        o.budget();
        o.sop();
        o.law();
    }
}