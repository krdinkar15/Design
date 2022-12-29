package creational.factory.notificationService;

public class SMSNotification implements Notification {

    @Override
    public void notifyUsers() {
        System.out.println("SMS - notifications");
    }
}
