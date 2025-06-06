package Day_eight_task;

// Example of access modifiers in Java
//class DefaultClass {
//    String defaultmessagee = "This is a default access modifier message and i am accessible within the same package only";
//}
//class ModifierExamples {
//    public String publicmessage = "This is a public access modifier message and i am accessible everywhere";
//    private String privatemessage = "This is a private access modifier message and i am accessible only within the class";
//
//    private void displayPrivate() {
//        System.out.println(privatemessage);
//    }
//    DefaultClass dc = new DefaultClass();
//    public void displayall() {
//        System.out.println(dc.defaultmessagee);
//        System.out.println(publicmessage);
//        displayPrivate();
//}
//}
//public class accesmodfiers {
//    public static void main(String[] args) {
//        ModifierExamples access = new ModifierExamples();
//        access.displayall();
//    }
//}

// Example of private access modifier with inner class
//class outer{
//    private String z = "This is a private message";
//
//    class inner {
//        public void display() {
//            System.out.println(z);
//        }
//    }
//}
//
//
//public class accesmodfiers {
//    public static void main(String[] args) {
//        outer obj = new outer();
//        outer.inner innerObj = obj.new inner();
//        innerObj.display();
//    }
//}

//Example of private access modifier with static inner class
//class outer{
//    private String z = "This is a private message";
//    private String z2 = "This is another private message";
//
//    class inner {
//        public void display() {
//            System.out.println(z);
//        }
//    }
//    class inner2 {
//        public void display20() {
//            System.out.println(z2);
//        }
//        
//    }
//
//    static class staticInner {
//        public void display2() {
//            System.out.println("This is a static inner class method");
//        }
//    }
//}
//
//public class accesmodfiers {
//    public static void main(String[] args) {
//        outer obj = new outer();
//        outer.inner innerObj = obj.new inner();
//        innerObj.display();
//        outer.staticInner sobj = new outer.staticInner(); //static inner class does not need an instance of outer class
//        sobj.display2();
//        outer.inner2 inobj2 = obj.new inner2();
//        inobj2.display20();
//    }
//}
//

class dk{
    int add (int a, int b){
        return a+b;
    }

}

public class accesmodfiers {
    public static void main(String[] args) {
        dk d = new dk();
        System.out.println(d.add(1, 0));
    }
}