package Day_ten_task;

interface paymentgateway {
    boolean processpayment(double amount);

    String gettransactionid(String transactionid);
}

class creditcard implements paymentgateway {
    public boolean processpayment(double amount) {
        System.out.println("processing payment: " + amount);
        return true;
    }

    public String gettransactionid(String transactionid) {
        return "Credit Card Transaction ID:" + transactionid;
    }
}

class upipayment implements paymentgateway {
    public boolean processpayment(double amount) {
        System.out.println("processing payment: " + amount);
        return true;
    }

    public String gettransactionid(String transactionid) {
        return "UPI Transaction ID:" + transactionid;
    }
}

public class ecomapp {
    public static void main(String[] args) {
        upipayment cc = new upipayment();
        cc.processpayment(1000);
        System.out.println(cc.gettransactionid("TNX10"));
    }

}
