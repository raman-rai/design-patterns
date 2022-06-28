package com.design.Singleton;

public class Application {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.printInstanceInfo();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.printInstanceInfo();
    }
}
