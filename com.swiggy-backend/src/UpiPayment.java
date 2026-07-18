public class UpiPayment implements PaymentProcessor{

    @Override
    public void processPayment(double amount){
        System.out.println("Processing with upi");
    }
}
