package com.rahul.designpattern.creational.factory;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Push notification sent.");
    }
}
