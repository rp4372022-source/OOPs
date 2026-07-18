
public class PaymentFactory {
    public PaymentProcessor processPayment(String method){
        if(method == null){
            return new CardPayment();
        }
        if(method.equalsIgnoreCase("UPI"))
            return new UpiPayment();
        return new CardPayment();
    }
}
