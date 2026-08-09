package oops_demo;
/*
Abstraction hides complex implementation details and only shows the essential
features to the user. In Java, we achieve this using abstract classes and interfaces.
*/
public class Abstraction {
    public static void main(String[] args){
        // Contract / Blueprint
        interface MessageSender {
            void sendMessage(String message, String recipient);
        }

        // Concrete Implementation
        class EmailSender implements MessageSender {
            @Override
            public void sendMessage(String message, String recipient) {
                // Complex SMTP server logic goes here
                System.out.println("Email sent to " + recipient);
            }
        }
    }
}
