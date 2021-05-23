package com.rahul.designpattern.creational.factory;

public class NotificationService {

    public void sendMessage(String notificationType) {
        System.out.println("Initializing notification service...");
        Notification notification = createNotification(notificationType);
        notification.notifyUser();
    }

    private Notification createNotification(String notificationType) {
        if (notificationType.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        } else if (notificationType.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("push")) {
            return new PushNotification();
        } else if(notificationType.equalsIgnoreCase("in-app")){
            return new InAppNotification();
        } else return null;
    }
}
