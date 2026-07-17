// The ability of a message or function to be displayed or executed in more than one form.
class Payment {
    // Process credit card
    void makePayment(String cardNumber, String csv) { 
        System.out.println("Paid via Card"); 
    }
    
    // Overloaded method: Process UPI
    void makePayment(String upiId) { 
        System.out.println("Paid via UPI"); 
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Payment py = new Payment();
        py.makePayment("abc123");
    }
}
