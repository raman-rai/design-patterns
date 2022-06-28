package com.design.Singleton;

public class Singleton {
    private static Singleton instance  = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void printInstanceInfo(){
        System.out.println("ID: " + instance.hashCode());
    }
}
