package com.rahul.designpattern.creational.abstractfactory;

import com.rahul.designpattern.creational.factory.App;

public class Client {
    public static void main(String[] args) {
        MobileFactory factory = FactoryGenerator.createFactory("3G");

        Nokia nokia = factory.createNokiaMobile();
        nokia.deviceInfo();

        Apple apple = factory.createAppleMobile();
        apple.deviceInfo();


        MobileFactory mobileFactory = FactoryGenerator.createFactory("4G");

        Nokia nokia1 = mobileFactory.createNokiaMobile();
        nokia1.deviceInfo();

        Apple apple1 = mobileFactory.createAppleMobile();
        apple1.deviceInfo();
    }
}
