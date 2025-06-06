package Day_nine_task;

//import Day_nine_task.members.*;
//public class hi {
//    public static void main(String[] args) {
//        hello h = new hello();
//        dk d = new dk();
//        anish a = new anish();
//        guru n = new guru();
//        h.display();
//        h.display2();
//        d.display();
//        a.display();
//        n.display();
//    }
//    
//}
//



                                /* single level inheritance*/



//class maths{
//    void formula(){
//        System.out.println("a+b = b+a");
//    }
//} 
//
//class chemistry extends maths{
//    void display(){
//        System.out.println("Inorganic chemistry");
//    }
//}
//
//public class hi {
//    public static void main(String[] args) {
//        maths m = new maths();
//        chemistry ch = new chemistry();
//        biology b = new biology();
//        b.formula();
//        m.formula();
//        ch.display();
//        ch.formula();
//    }
//
//    
//}


                                /*multilevel inheritance*/
/* a sub class has a super class and the super class is th sub class of super class */
//
//class maths{
//    void formula(){
//        System.out.println("a+b = b+a");
//    }
//} 
//
//class chemistry extends maths{
//    void display(){
//        System.out.println("Inorganic chemistry");
//    }
//}
//
//class biology extends chemistry{
//    void display1(){
//        System.out.println("using maths" );
//    }
//    
//}
//
//public class hi {
//    public static void main(String[] args) {
//        chemistry ch = new chemistry();
//        biology b = new biology();
//        b.formula();
//        ch.display();
//        ch.formula();
//        ch.display1()
//
//    }
//
//    
//}

                                /*hierarchical inheritance*/
/* One super class with multiple sub class*/



class maths{
    void formula(){
        System.out.println("a+b = b+a");
    }
} 

class chemistry extends maths{
    void display(){
        System.out.println("Inorganic chemistry");
    }
}

class biology extends maths{
    void display1(){
        System.out.println("using maths" );
    }
    
}

public class hi {
    public static void main(String[] args) {
        chemistry ch = new chemistry();
        biology b = new biology();
        b.formula();
        ch.display();
        ch.formula();

    }

    
}

                                    /*just for testing */
                                    
/*                                  
class maths{
    void formula(){
        System.out.println("a+b = b+a");
    }
} 

class chemistry extends maths{
    void display(){
        System.out.println("Inorganic chemistry");
    }
}

class biology extends maths{
    void display1(){
        System.out.println("using maths" );
    }
    
}

class botany extends chemistry{
    void display1(){
        System.out.println("using maths" );
    }
    
}

public class hi {
    public static void main(String[] args) {
        chemistry ch = new chemistry();
        biology b = new biology();
        b.formula();
        ch.display();
        ch.formula();

    }
}
 */