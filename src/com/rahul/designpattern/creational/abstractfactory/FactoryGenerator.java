package com.rahul.designpattern.creational.abstractfactory;

public class FactoryGenerator {
    public static MobileFactory createFactory(String type){
        if (type.equalsIgnoreCase("3G")){
            return new Mobile3GFactory();
        } else if (type.equalsIgnoreCase("4G")){
            return new Mobile4GFactory();
        }
        return null;
    }
}
