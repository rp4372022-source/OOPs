// Bundling data toghether and preventing direct access
class BankAccount{
    private String name;
    private String accountNum;
    private double balance;//instance variable

    BankAccount(String Username, String accountNum, double balance){
        if(Username != null)name = Username;
        else throw new IllegalArgumentException("Username was null");
        if(accountNum.length() == 10) this.accountNum = accountNum;
        else throw new IllegalArgumentException("Account number was not of 10 digits"); 
        if(balance >= 0) this.balance = balance;
        else throw new IllegalArgumentException("Negative balance entered"); 
        
    }

    // getters
    public String getUserName(){
        return name;
    }
    public String getAccNum(){
        return accountNum;
    }
    public double getBalance(){
        return balance;
    }

    //setters
    public void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Money deposited");
        } else {
            throw new IllegalArgumentException("Invalid Amount Entered");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            balance -= amount;
            System.out.println("Money withdrawn");
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

}
public class Encapsulation{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Rutik", "1234567890", 100);
        b1.deposite(100);
        System.out.println(b1.getBalance());
    }
}