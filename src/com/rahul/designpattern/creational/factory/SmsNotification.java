package com.rahul.designpattern.creational.factory;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("SMS notification sent.");
    }
}
