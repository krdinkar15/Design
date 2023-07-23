package designPatterns.creational.factory.notificationService;

public class PushNotification implements Notification{
    @Override
    public void notifyUsers() {
        System.out.println("Push - notifications");
    }
}
