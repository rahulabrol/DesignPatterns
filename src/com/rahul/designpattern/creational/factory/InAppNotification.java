package com.rahul.designpattern.creational.factory;

public class InAppNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("In app notifications sent.");
    }
}
