package designPatterns.creational.factory.notificationService;

public class EmailNotification implements Notification{
    @Override
    public void notifyUsers() {
        System.out.println("Email - notification");
    }
}
