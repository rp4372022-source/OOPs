// Showing only essential features to the user and hiding internal implementation details.

// Interface defines "What to do", not "How to do it"
interface NotificationService {
    void sendNotification(String message); 
}

// Actual implementation
class EmailNotification implements NotificationService {
    public void sendNotification(String message) {
        // Complex SMTP server logic goes here
        System.out.println("Email sent: " + message);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotification();
        notificationService.sendNotification("GM");
    }
}
