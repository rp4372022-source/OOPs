package oops_demo;
/*
    Encapsulation is the practice of bundling data (variables) and methods together,
    while restricting direct access to protect the internal state.
 */



public class Encapsulation {
    public static void main(String[] args) {
        class BankAccount {
            private double balance; // Private data: cannot be accessed directly outside

            // Public getter
            public double getBalance() {
                return this.balance;
            }

            // Public setter with business logic/validation
            public void deposit(double amount) {
                if (amount > 0) {
                    this.balance += amount;
                }
            }
        }

        BankAccount account = new BankAccount();
        double balance = account.getBalance();
        System.out.println(balance);
    }
}
