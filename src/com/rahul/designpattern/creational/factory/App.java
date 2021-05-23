package com.rahul.designpattern.creational.factory;

public class App {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendMessage("in-app");
        System.out.println("Done");
    }
}
