package com.rahul.designpattern.creational.abstractfactory;

import com.rahul.designpattern.creational.factory.App;

public class Apple3G implements Apple {
    @Override
    public void deviceInfo() {
        System.out.println("Apple 3g device.");
    }
}
