package oops_demo;


public class Polymorphism {
    public static void main(String[] args){
        class PaymentProcessor {
            public void process() {
                System.out.println("Processing generic payment");
            }
        }

        class CreditCardPayment extends PaymentProcessor {
            @Override
            public void process() {
                System.out.println("Processing credit card payment through Visa/Mastercard API");
            }
        }


    }
}
